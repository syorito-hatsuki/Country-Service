package dev.syorito_hatsuki.country_service.api.service.countries;

import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.countries.response.CountryInfo;

public interface CountriesService {

    Countries getCountries();

    CountryInfo getCountryInfoByName(String name);
}
