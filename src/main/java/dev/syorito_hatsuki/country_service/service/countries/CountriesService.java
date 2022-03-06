package dev.syorito_hatsuki.country_service.service.countries;

import dev.syorito_hatsuki.country_service.dto.CountryInfo;
import dev.syorito_hatsuki.country_service.dto.countries.Countries;

public interface CountriesService {

    Countries getCountries();

    CountryInfo getCountryInfoByName(String name);
}
