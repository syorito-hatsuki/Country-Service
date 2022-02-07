package dev.syorito_hatsuki.country_service.api.model.capital;

public class CapitalData {
    private final String name;
    private final String capital;
    private final String iso2;
    private final String iso3;

    public CapitalData(String name, String capital, String iso2, String iso3) {
        this.name = name;
        this.capital = capital;
        this.iso2 = iso2;
        this.iso3 = iso3;
    }

    public String getIso3() {
        return iso3;
    }

    public String getIso2() {
        return iso2;
    }

    public String getCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }
}
