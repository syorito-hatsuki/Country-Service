package dev.syorito_hatsuki.country_service.dto.population.request;

public class Country {

    private final String country;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
