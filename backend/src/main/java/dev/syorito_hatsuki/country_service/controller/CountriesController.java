package dev.syorito_hatsuki.country_service.controller;

import dev.syorito_hatsuki.country_service.dto.CountryInfo;
import dev.syorito_hatsuki.country_service.dto.countries.Countries;
import dev.syorito_hatsuki.country_service.service.countries.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("countries")
public class CountriesController {

    @Autowired
    CountriesService service;

    /*   COMPLETED   */
    @GetMapping
    public Countries countriesPage() {
        return service.getCountries();
    }

    /*   COMPLETED   */
    @GetMapping("/{name}")
    public CountryInfo countryInfoByName(@PathVariable String name) {
        return service.getCountryInfoByName(name);
    }
}
