package dev.syorito_hatsuki.country_service.dto.flag.response;

public class FlagData {
    private final String name;
    private final String flag;
    private final String iso2;
    private final String iso3;

    public FlagData(String name, String flag, String iso2, String iso3) {
        this.name = name;
        this.flag = flag;
        this.iso2 = iso2;
        this.iso3 = iso3;
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
