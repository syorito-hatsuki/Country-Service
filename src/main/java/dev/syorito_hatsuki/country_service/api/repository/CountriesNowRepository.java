package dev.syorito_hatsuki.country_service.api.repository;

import dev.syorito_hatsuki.country_service.api.model.capital.Capital;
import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.country_code.response.CountryCode;
import dev.syorito_hatsuki.country_service.api.model.flag.response.Flag;
import dev.syorito_hatsuki.country_service.api.model.population.request.Country;
import dev.syorito_hatsuki.country_service.api.model.population.responce.Population;
import org.springframework.web.bind.annotation.RequestBody;

public interface CountriesNowRepository {

    //    @GetMapping("iso")
    Countries getCountries();

    //    @PostMapping("population")
    Population getPopulation(@RequestBody Country country);

    //    @PostMapping("flag/images")
    Flag getFlagImage(@RequestBody Country country);

    //    @PostMapping("capital")
    Capital getCapital(@RequestBody Country country);

    //    @PostMapping("iso")
    CountryCode getCountryCode(@RequestBody Country country);
}
