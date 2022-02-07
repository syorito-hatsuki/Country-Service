package dev.syorito_hatsuki.country_service.api.model.population.request;

public class Country {

    private final String country;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
