package dev.syorito_hatsuki.country_service.domain.repository.model.flag;

public class FlagData {
    private final String name;
    private final String flag;
    private final String iso2;
    private final String iso3;

    public FlagData() {
        this.name = "none";
        this.flag = "none";
        this.iso2 = "none";
        this.iso3 = "none";
    }

    public String getIso3() {
        return iso3;
    }

    public String getIso2() {
        return iso2;
    }

    public String getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }
}
