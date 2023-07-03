import {Card, CardContent, CardMedia, CircularProgress, Dialog, DialogTitle, Typography} from "@mui/material";
import React from "react";
import {useQuery} from "@tanstack/react-query";
import Error from "../Error";
import Grid from "@mui/material/Unstable_Grid2";
import Country from "../../dto/Country";

export interface DialogProps {
    countryName: string
    open: boolean
    onClose: () => void;
}

export default function CountryDialog(props: DialogProps) {
    const {countryName, open, onClose} = props;

    const {data, status, error} = useQuery({
        queryKey: ['getCountryByName', countryName],
        queryFn: () => fetch(`http://localhost:8080/countries/${countryName}`)
            .then<Country>(data => data.json())
    })

    if (status === 'error') return (
        <Dialog open={open} onClose={onClose}>
            <DialogTitle>{countryName}</DialogTitle>
            <Error message={(error as Error).message}/>
        </Dialog>
    )

    if (status === 'loading') return (
        <Dialog open={open} onClose={onClose}>
            <DialogTitle>{countryName}</DialogTitle>
            <Grid container justifyContent="center">
                <CircularProgress sx={{margin: 4}}/>
            </Grid>
        </Dialog>
    )

    return (
        <Dialog open={open} onClose={onClose}>
            <DialogTitle>{countryName}</DialogTitle>
            <Card sx={{maxWidth: 345}}>
                <CardMedia
                    component="img"
                    sx={{height: 140}}
                    image={data.flag_file_url}
                    title={data.name}
                />
                <CardContent>
                    <Typography gutterBottom variant="h5" component="div">
                        {data.name} ({data.country_code})
                    </Typography>
                    <Typography variant="body1" color="text.secondary">
                        {data.capital}
                    </Typography>
                    <Typography variant="body2" color="text.secondary">
                        {`Population: ${data.population}`}
                    </Typography>
                </CardContent>
            </Card>
        </Dialog>
    )
}