package dev.syorito_hatsuki.country_service.dto.population.responce;

public class Population {
    private final PopulationData data;

    public Population(PopulationData data) {
        this.data = data;
    }

    public PopulationData getData() {
        return data;
    }
}
