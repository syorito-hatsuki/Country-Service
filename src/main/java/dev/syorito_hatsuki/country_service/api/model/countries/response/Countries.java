package dev.syorito_hatsuki.country_service.api.model.countries.response;

import java.util.List;

public class Countries {

    private final List<CountryData> data;

    public Countries(List<CountryData> countryList) {
        this.data = countryList;
    }

    public List<CountryData> getCountries() {
        return data;
    }

}
