package dev.syorito_hatsuki.country_service.domain.repository.model.countries;

public class CountryData {
    public String name;
    public String Iso2;
    public String Iso3;

    public CountryData() {
        name = "none";
        Iso2 = "none";
        Iso3 = "none";
    }

    public String getName() {
        return name;
    }

    public String getIso2() {
        return Iso2;
    }

    public String getIso3() {
        return Iso3;
    }
}
