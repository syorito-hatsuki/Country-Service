package dev.syorito_hatsuki.country_service.dto.countries;

import com.fasterxml.jackson.annotation.JsonGetter;

public class CountriesData {

    private final String countryName;
    private final String countryCode;

    public CountriesData() {
        countryName = "none";
        countryCode = "none";
    }

    public CountriesData(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    @JsonGetter("name")
    public String getCountryName() {
        return countryName;
    }

    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }
}
