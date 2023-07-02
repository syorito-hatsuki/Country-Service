import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import {createBrowserRouter, createRoutesFromElements, Route, RouterProvider} from "react-router-dom";
import CountriesPage from "./pages/CountriesPage";
import NotFoundPage from "./pages/NotFoundPage";

const queryClient = new QueryClient()

ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
).render(
    <React.StrictMode>
        <QueryClientProvider client={queryClient}>
            <RouterProvider router={
                createBrowserRouter(
                    createRoutesFromElements(
                        <Route path="/" element={<App/>}>
                            <Route index element={<CountriesPage/>}/>

                            <Route path="*" element={<NotFoundPage/>}/>
                        </Route>
                    )
                )
            }/>
        </QueryClientProvider>
    </React.StrictMode>
);