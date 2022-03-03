package dev.syorito_hatsuki.country_service.controller;

import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.service.countries.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("countries")
public class CountriesController {

    static Logger logger = Logger.getGlobal();

    @Autowired
    CountriesService service;

    /*   COMPLETED   */
    @GetMapping
    public Countries countriesPage() {
        logger.info(service.getCountries().getMsg());
        return service.getCountries();
    }

    /*   COMPLETED   */
//    @GetMapping("/{name}")
//    public CountryInfo countryInfoByName(@PathVariable String name) throws IOException {
////        return service.getCountryInfo(new Country(name));
//    }
}
