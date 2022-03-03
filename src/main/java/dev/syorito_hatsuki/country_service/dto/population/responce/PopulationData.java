package dev.syorito_hatsuki.country_service.dto.population.responce;

import java.util.List;

public class PopulationData {
    private final String country;
    private final String code;
    private final String iso3;
    private final List<PopulationCount> populationCounts;

    public PopulationData(String country, String code, String iso3, List<PopulationCount> populationCounts) {
        this.country = country;
        this.code = code;
        this.iso3 = iso3;
        this.populationCounts = populationCounts;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

    public String getIso3() {
        return iso3;
    }

    public List<PopulationCount> getPopulationCounts() {
        return populationCounts;
    }
}
