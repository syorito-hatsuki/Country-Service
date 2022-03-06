package dev.syorito_hatsuki.country_service.domain.repository;

import dev.syorito_hatsuki.country_service.domain.repository.model.Country;
import dev.syorito_hatsuki.country_service.domain.repository.model.capital.Capital;
import dev.syorito_hatsuki.country_service.domain.repository.model.countries.Countries;
import dev.syorito_hatsuki.country_service.domain.repository.model.country_code.CountryCode;
import dev.syorito_hatsuki.country_service.domain.repository.model.flag.Flag;
import dev.syorito_hatsuki.country_service.domain.repository.model.population.Population;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CountriesNowRepositoryImpl implements CountriesNowRepository {

    private final WebClient client;

    public CountriesNowRepositoryImpl() {
        this.client = WebClient.builder()
                .baseUrl("https://countriesnow.space/api/v0.1/countries/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Countries getCountries() {
        return client.get()
                .uri("iso")
                .retrieve()
                .bodyToMono(Countries.class)
                .block();
    }

    @Override
    public Population getPopulation(Country country) {
        return client.post()
                .uri("population")
                .bodyValue(country)
                .retrieve()
                .bodyToMono(Population.class)
                .block();
    }

    @Override
    public Flag getFlag(Country country) {
        return client.post()
                .uri("flag/images")
                .bodyValue(country)
                .retrieve()
                .bodyToMono(Flag.class)
                .block();
    }

    @Override
    public Capital getCapital(Country country) {
        return client.post()
                .uri("capital")
                .bodyValue(country)
                .retrieve()
                .bodyToMono(Capital.class)
                .block();
    }

    @Override
    public CountryCode getCountryCode(Country country) {
        return client.post()
                .uri("iso")
                .bodyValue(country)
                .retrieve()
                .bodyToMono(CountryCode.class)
                .block();
    }
}
