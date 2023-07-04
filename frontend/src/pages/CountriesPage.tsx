import {Autocomplete, Card, CardActionArea, CardContent, CircularProgress, TextField, Typography} from "@mui/material";
import {useQuery} from "@tanstack/react-query";
import {Countries} from "../dto/Countries";
import React, {useState} from "react";
import Grid from "@mui/material/Unstable_Grid2";
import CountryDialog from "../components/dialogs/CountryDialog";
import ErrorView from "../components/ErrorView";

export default function CountriesPage() {

    const [open, setOpen] = useState<boolean>(false);
    const [country, setCountry] = useState<string>("")

    const handleClickOpen = (country: string) => {
        setCountry(country)
        setOpen(true);
    };

    const handleClose = () => {
        setOpen(false);
    };

    const {data, status, error} = useQuery({
        queryKey: ['getCountries'],
        queryFn: () => fetch(`http://localhost:8080/countries`)
            .then<Countries>(data => data.json())
    })

    if (status === 'error') return (
        <Grid container justifyContent="center" spacing={2} paddingY={4}>
            <ErrorView message={(error as Error).message}/>
        </Grid>
    )

    if (status === 'loading') return (
        <Grid container justifyContent="center" spacing={2} paddingY={4}>
            <CircularProgress/>
        </Grid>
    )

    return (
        <>
            <Autocomplete
                sx={{paddingTop: 4}}
                id="country-search"
                options={data.countries.map((option) => option.name)}
                renderInput={(params) => {
                    return <TextField {...params} label="Country"/>;
                }}
                onChange={(event: any, newValue: string | null) => {
                    handleClickOpen(newValue == null ? '' : newValue)
                }}
            />

            {country !== undefined ? (<CountryDialog countryName={country} open={open} onClose={handleClose}/>) : <></>}

            <Grid container justifyContent="center" spacing={2} paddingY={4}>
                {data.countries.map(value => {
                    return (
                        <Grid key={value.name}>
                            <Card sx={{width: 345}}>
                                <CardActionArea>
                                    <CardContent onClick={() => handleClickOpen(value.name)}>
                                        <Typography gutterBottom noWrap textOverflow="ellipsis" variant="h5"
                                                    component="div">
                                            {value.name}
                                        </Typography>
                                        <Typography variant="body1" color="text.secondary">
                                            {value.country_code}
                                        </Typography>
                                    </CardContent>
                                </CardActionArea>
                            </Card>
                        </Grid>
                    )
                })}
            </Grid>
        </>
    )
}