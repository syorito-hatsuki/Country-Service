package dev.syorito_hatsuki.country_service.domain.repository.model.population;

public class PopulationCount {
    private final Integer year;
    private final Integer value;

    public PopulationCount() {
        year = -1;
        value = -1;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getValue() {
        return value;
    }
}
