package dev.syorito_hatsuki.country_service.api.model.countries.response;

public class CountryData {

    private final String name;
    private final String Iso2;

    public CountryData(String name, String country_code) {
        this.name = name;
        this.Iso2 = country_code;
    }

    public String getCountry_code() {
        return Iso2;
    }

    public String getName() {
        return name;
    }

}
