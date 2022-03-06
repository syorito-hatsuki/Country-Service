package dev.syorito_hatsuki.country_service.service.countries;

import dev.syorito_hatsuki.country_service.domain.repository.CountriesNowRepository;
import dev.syorito_hatsuki.country_service.domain.repository.model.Country;
import dev.syorito_hatsuki.country_service.dto.CountryInfo;
import dev.syorito_hatsuki.country_service.dto.countries.Countries;
import dev.syorito_hatsuki.country_service.dto.countries.CountriesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    CountriesNowRepository countriesNowRepository;

    @Override
    public Countries getCountries() {
        var remote = countriesNowRepository.getCountries();
        ArrayList<CountriesData> countriesData = new ArrayList<>();
        remote.data.forEach(it -> countriesData.add(new CountriesData(it.name, it.Iso2)));
        return new Countries(countriesData);
    }

    @Override
    public CountryInfo getCountryInfoByName(String name) {
        var country = new Country(name);
        return new CountryInfo(
                country.getCountry(),
                countriesNowRepository.getCountryCode(country).getData().getIso2(),
                countriesNowRepository.getCapital(country).getData().getCapital(),
                countriesNowRepository.getPopulation(country).getData().getLatestPopulation(),
                countriesNowRepository.getFlag(country).getData().getFlag()
        );
    }
}