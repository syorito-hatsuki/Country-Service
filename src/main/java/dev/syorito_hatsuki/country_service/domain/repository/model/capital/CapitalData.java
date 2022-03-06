package dev.syorito_hatsuki.country_service.domain.repository.model.capital;

public class CapitalData {
    private final String name;
    private final String capital;
    private final String iso2;
    private final String iso3;

    public CapitalData() {
        this.name = "none";
        this.capital = "none";
        this.iso2 = "none";
        this.iso3 = "none";
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
