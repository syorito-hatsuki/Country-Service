import {Box, Link, Typography} from "@mui/material";
import React from "react";

export default function Copyright() {
    return (
        <Box sx={{flexGrow: 1}}>
            <Typography variant="body2" color="text.secondary" align="center">
                {'Source code available on '}
                <Link color="inherit" href="https://github.com/syorito-hatsuki/Country-Service">
                    {'Github'}
                </Link>
                {' 2023'}
            </Typography>
        </Box>
    );
}