package dev.syorito_hatsuki.country_service.api.repository;

import dev.syorito_hatsuki.country_service.api.model.capital.Capital;
import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.country_code.response.CountryCode;
import dev.syorito_hatsuki.country_service.api.model.flag.response.Flag;
import dev.syorito_hatsuki.country_service.api.model.population.request.Country;
import dev.syorito_hatsuki.country_service.api.model.population.responce.Population;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountriesNowRepositoryImpl implements CountriesNowRepository {

    private static final String URL = "https://countriesnow.space/api/v0.1/countries/";

    @Override
    public Countries getCountries() {
        var headed = new HttpHeaders();
        headed.setContentType(MediaType.APPLICATION_JSON);
//        var f = new RestTemplate().exchange(
//                URL + "iso",
//                HttpMethod.GET,
//                new HttpEntity(
//                        null,
//                        headed
//                ),
//                Countries.class).getBody();

        return new RestTemplate().getForObject(
                URL + "iso",
                Countries.class
        );
    }

    @Override
    public Population getPopulation(Country country) {
        return null;
    }

    @Override
    public Flag getFlagImage(Country country) {
        return null;
    }

    @Override
    public Capital getCapital(Country country) {
        return null;
    }

    @Override
    public CountryCode getCountryCode(Country country) {
        return null;
    }
}
