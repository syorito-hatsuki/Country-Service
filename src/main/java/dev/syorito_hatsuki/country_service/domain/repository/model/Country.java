package dev.syorito_hatsuki.country_service.domain.repository.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Country {

    private final String country;

    public Country(String country) {
        this.country = country;
    }

    public Country() {
        country = "none";
    }

    @JsonGetter("country")
    public String getCountry() {
        return country;
    }
}
