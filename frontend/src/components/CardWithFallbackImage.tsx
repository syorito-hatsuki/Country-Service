import React, {ComponentProps, useState} from "react";
import {CardMedia} from "@mui/material";

export default function CardWithFallbackImage(props: ComponentProps<any>) {
    const [imageError, setImageError] = useState(false);

    const {imageUrl, imageTitle} = props

    const handleImageError = () => {
        setImageError(true);
    };

    return (
        <CardMedia
            component="img"
            alt={`${imageTitle} Flag`}
            sx={{height: 140}}
            image={imageError ? "https://vignette.wikia.nocookie.net/vexillology/images/3/34/Question_mark_flag.svg" : imageUrl}
            title={imageTitle}
            onError={handleImageError}
        />
    );
};