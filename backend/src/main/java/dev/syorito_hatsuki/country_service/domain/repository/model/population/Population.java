package dev.syorito_hatsuki.country_service.domain.repository.model.population;

public class Population {
    private final PopulationData data;

    public Population() {
        data = new PopulationData();
    }

    public PopulationData getData() {
        return data;
    }
}
