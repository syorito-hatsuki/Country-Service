package dev.syorito_hatsuki.country_service.domain.repository.model.country_code;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryCodeData {
    private final String name;

    @JsonProperty("Iso2")
    private final String Iso2;

    @JsonProperty("Iso3")
    private final String Iso3;

    public CountryCodeData() {
        this.name = "none";
        this.Iso2 = "none";
        this.Iso3 = "none";
    }

    public String getName() {
        return name;
    }

    @JsonGetter("Iso2")
    public String getIso2() {
        return Iso2;
    }

    @JsonGetter("Iso3")
    public String getIso3() {
        return Iso3;
    }
}
