package dev.syorito_hatsuki.country_service.api.model.countries.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryData {

    @JsonProperty(value = "name")
    public String name;
    @JsonProperty(value = "Iso2")
    public String Iso2;
    @JsonProperty(value = "Iso3")
    public String Iso3;

    public CountryData(String name, String Iso2, String Iso3) {
        this.name = name;
        this.Iso2 = Iso2;
        this.Iso3 = Iso3;
    }

    public String getIso2() {
        return Iso2;
    }

    public String getName() {
        return name;
    }

    public String getIso3() {
        return Iso3;
    }
}
