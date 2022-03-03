package dev.syorito_hatsuki.country_service.dto.population.responce;

public class PopulationCount {
    private final Integer year;
    private final Integer value;

    public PopulationCount(Integer year, Integer value) {
        this.year = year;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getYear() {
        return year;
    }
}
