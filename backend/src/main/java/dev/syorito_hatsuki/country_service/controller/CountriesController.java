package dev.syorito_hatsuki.country_service.controller;

import dev.syorito_hatsuki.country_service.dto.CountryInfo;
import dev.syorito_hatsuki.country_service.dto.countries.Countries;
import dev.syorito_hatsuki.country_service.exception.JsonException;
import dev.syorito_hatsuki.country_service.service.countries.CountriesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@RestController
@RequestMapping("countries")
public class CountriesController {

    final CountriesService service;

    public CountriesController(CountriesService service) {
        this.service = service;
    }

    /*   COMPLETED   */
    @GetMapping
    public ResponseEntity<Countries> countriesPage() {
        try {
            return ResponseEntity.ok(service.getCountries());
        } catch (WebClientResponseException e) {
            throw new JsonException(e.getStatusCode().value(), e.getStatusText());
        }
    }

    /*   COMPLETED   */
    @GetMapping("/{name}")
    public ResponseEntity<CountryInfo> countryInfoByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(service.getCountryInfoByName(name));
        } catch (WebClientResponseException e) {
            throw new JsonException(e.getStatusCode().value(), e.getStatusText());
        }
    }
}
