import React from "react";
import {AppBar, Box, Container, Toolbar, Typography} from "@mui/material";

export default function TitleAppBar() {
    return (
        <Box sx={{flexGrow: 1}}>
            <AppBar position="static">
                <Container maxWidth="xl">
                    <Toolbar disableGutters>
                        <Typography align="center" variant="h6" noWrap component="div" sx={{flexGrow: 1}}>
                            Country Service
                        </Typography>
                    </Toolbar>
                </Container>
            </AppBar>
        </Box>
    )
}
