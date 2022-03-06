package dev.syorito_hatsuki.country_service.dto;

import com.fasterxml.jackson.annotation.JsonGetter;

public class CountryInfo {
    private final String name;
    private final String countryCode;
    private final String capital;
    private final Integer population;
    private final String flagFileUrl;


    public CountryInfo() {
        name = "none";
        countryCode = "none";
        capital = "none";
        population = -1;
        flagFileUrl = "none";
    }

    public CountryInfo(String name, String countryCode, String capital, Integer population, String flagFileUrl) {
        this.name = name;
        this.countryCode = countryCode;
        this.capital = capital;
        this.population = population;
        this.flagFileUrl = flagFileUrl;
    }

    public String getName() {
        return name;
    }

    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getPopulation() {
        return population;
    }

    @JsonGetter("flag_file_url")
    public String getFlagFileUrl() {
        return flagFileUrl;
    }
}
