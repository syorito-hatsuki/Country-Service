import {Typography} from "@mui/material";
import Grid from "@mui/material/Unstable_Grid2";
import React from "react";

interface ErrorMessage {
    message: string
}

export default function Error(props: ErrorMessage) {
    return (
        <Grid container justifyContent="center" spacing={2} paddingY={4}>
            <Typography variant="h2">
                {`Error: ${props.message}`}
            </Typography>
        </Grid>
    )
}