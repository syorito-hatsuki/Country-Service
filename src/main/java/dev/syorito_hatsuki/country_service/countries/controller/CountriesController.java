package dev.syorito_hatsuki.country_service.countries.controller;

import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.countries.response.CountryInfo;
import dev.syorito_hatsuki.country_service.api.model.population.request.Country;
import dev.syorito_hatsuki.country_service.api.service.CountriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CountriesController {

    /*   Tried @Autowired but not work   */
    private final CountriesService service = new CountriesService();

    /*   COMPLETED   */
    @GetMapping("countries")
    public Countries countriesPage() throws IOException {
        return service.getCountries();
    }

    /*   COMPLETED   */
    @GetMapping("countries/{name}")
    public CountryInfo countryInfoByName(@PathVariable String name) throws IOException {
        return service.getCountryInfo(new Country(name));
    }
}
