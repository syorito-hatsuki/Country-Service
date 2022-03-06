package dev.syorito_hatsuki.country_service.dto.countries;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.List;

public class Countries {

    private final List<CountriesData> data;

    public Countries() {
        data = List.of();
    }

    public Countries(List<CountriesData> data) {
        this.data = data;
    }

    @JsonGetter("countries")
    public List<CountriesData> getData() {
        return data;
    }
}
