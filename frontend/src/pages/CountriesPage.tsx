import {Autocomplete, Card, CardActionArea, CardContent, CircularProgress, TextField, Typography} from "@mui/material";
import {useQuery} from "@tanstack/react-query";
import {Countries} from "../dto/Countries";
import React from "react";
import Grid from "@mui/material/Unstable_Grid2";

export default function CountriesPage() {

    const {data, status, error} = useQuery({
        queryFn: () => fetch(`http://localhost:8080/countries`)
            .then<Countries>(data => data.json())
    })

    if (status === 'error') return (
        <Typography variant="h3">
            {`Error: ${error}`}
        </Typography>
    )

    if (status === 'loading') return (<CircularProgress/>)

    return (
        <>
            <Autocomplete
                sx={{paddingTop: 4}}
                id="country-search"
                freeSolo
                options={data.countries.map((option) => option.name)}
                renderInput={(params) => {
                    return <TextField {...params} label="Country"/>;
                }}
            />

            <Grid container justifyContent="center" spacing={2} paddingY={4}>
                {data.countries.map(value => {
                    return (
                        <Grid key={value.name}>
                            <Card sx={{minWidth: 345, maxWidth: 345}}>
                                <CardActionArea>
                                    <CardContent>
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