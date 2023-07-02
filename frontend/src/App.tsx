import React from 'react';
import {Container} from "@mui/material";
import TitleAppBar from "./components/TitleAppBar";
import Copyright from "./components/Copyright";
import {Outlet} from "react-router-dom";

export default function App() {
    return (
        <>
            <TitleAppBar/>
            <Container maxWidth="xl">
                <Outlet/>
            </Container>
            <Copyright/>
        </>
    )
}