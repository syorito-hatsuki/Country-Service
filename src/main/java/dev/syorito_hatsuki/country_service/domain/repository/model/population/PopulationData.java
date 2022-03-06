package dev.syorito_hatsuki.country_service.domain.repository.model.population;

import java.util.List;

public class PopulationData {
    private final String country;
    private final String code;
    private final String iso3;
    private final List<PopulationCount> populationCounts;

    public PopulationData() {
        country = "none";
        code = "none";
        iso3 = "none";
        populationCounts = List.of();
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

    public Integer getLatestPopulation() {
        return populationCounts.size() > 0 ? populationCounts.get(populationCounts.size() - 1).getValue() : -1;
    }
}
