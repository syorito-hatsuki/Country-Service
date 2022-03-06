package dev.syorito_hatsuki.country_service.domain.repository;

import dev.syorito_hatsuki.country_service.domain.repository.model.Country;
import dev.syorito_hatsuki.country_service.domain.repository.model.capital.Capital;
import dev.syorito_hatsuki.country_service.domain.repository.model.countries.Countries;
import dev.syorito_hatsuki.country_service.domain.repository.model.country_code.CountryCode;
import dev.syorito_hatsuki.country_service.domain.repository.model.flag.Flag;
import dev.syorito_hatsuki.country_service.domain.repository.model.population.Population;

public interface CountriesNowRepository {

    Countries getCountries();

    Population getPopulation(Country country);

    Flag getFlag(Country country);

    Capital getCapital(Country country);

    CountryCode getCountryCode(Country country);
}
