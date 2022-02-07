package dev.syorito_hatsuki.country_service.api.model.country_code.response;

public class CountryCodeData {
    private final String name;
    private final String Iso2;
    private final String Iso3;

    public CountryCodeData(String name, String iso2, String iso3) {
        this.name = name;
        this.Iso2 = iso2;
        this.Iso3 = iso3;
    }

    public String getIso3() {
        return Iso3;
    }

    public String getIso2() {
        return Iso2;
    }

    public String getName() {
        return name;
    }
}
