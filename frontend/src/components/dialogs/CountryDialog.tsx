import {Card, CardContent, CircularProgress, Dialog, DialogTitle, Typography} from "@mui/material";
import React from "react";
import {useQuery} from "@tanstack/react-query";
import ErrorView from "../ErrorView";
import Grid from "@mui/material/Unstable_Grid2";
import Country from "../../dto/Country";
import ErrorResponse from "../../dto/ErrorResponse";
import CardWithFallbackImage from "../CardWithFallbackImage";

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
            .then<Country | ErrorResponse>(data => data.json())
    })

    if (status === 'error') return (
        <Dialog open={open} onClose={onClose}>
            <DialogTitle>{countryName}</DialogTitle>
            <ErrorView message={(error as Error).message}/>
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

    if (typeof data === 'object' && 'message' in data) {
        if (data.code === 404) data.message = "Information not found for selected country"
        return (
            <Dialog open={open} onClose={onClose}>
                <ErrorView message={data.message}/>
            </Dialog>
        )
    }

    return (
        <Dialog open={open} onClose={onClose}>
            <DialogTitle>{countryName}</DialogTitle>
            <Card sx={{maxWidth: 345}}>
                <CardWithFallbackImage imageUrl={data.flag_file_url} imageTitle={data.name}/>
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