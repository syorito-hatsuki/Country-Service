package dev.syorito_hatsuki.country_service.service.countries;

import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.countries.response.CountryInfo;
import dev.syorito_hatsuki.country_service.repository.CountriesNowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    CountriesNowRepository countriesNowService;

    public CountriesServiceImpl() {

    }

    @Override
    public Countries getCountries() {
        return countriesNowService.getCountries();
    }

    @Override
    public CountryInfo getCountryInfoByName(String name) {
        return null;
    }

//
//    public Countries getCountries() throws IOException {
//
//        Response<Countries> response = service.getCountries().execute();
//
//        if (!response.isSuccessful()) {
//            throw new IOException(response.errorBody() != null
//                    ? response.errorBody().string() : "Unknown error");
//        }
//
//        return response.body();
//    }
//
//    private CountryCode getCountryCode(Country country) throws IOException {
//
//        Response<CountryCode> response = service.getCountryCode(country).execute();
//
//        if (!response.isSuccessful()) {
//            throw new IOException(response.errorBody() != null
//                    ? response.errorBody().string() : "Unknown error");
//        }
//
//        return response.body();
//    }
//
//    private Capital getCapital(Country country) throws IOException {
//
//        Response<Capital> response = service.getCapital(country).execute();
//
//        if (!response.isSuccessful()) {
//            throw new IOException(response.errorBody() != null
//                    ? response.errorBody().string() : "Unknown error");
//        }
//
//        return response.body();
//    }
//
//    private Integer getLatestPopulation(Country country) throws IOException {
//
//        Response<Population> response = service.getPopulation(country).execute();
//
//        if (!response.isSuccessful()) {
//            throw new IOException(response.errorBody() != null
//                    ? response.errorBody().string() : "Unknown error");
//        }
//
//        assert response.body() != null;
//        var body = response.body().getData().getPopulationCounts();
//        return body.get(body.size() - 1).getValue();
//    }
//
//    private Flag getFlagAsURL(Country country) throws IOException {
//
//        Response<Flag> response = service.getFlagImage(country).execute();
//
//        if (!response.isSuccessful()) {
//            throw new IOException(response.errorBody() != null
//                    ? response.errorBody().string() : "Unknown error");
//        }
//
//        return response.body();
//    }
//
//    public CountryInfo getCountryInfo(Country country) throws IOException {
//        return new CountryInfo(
//                country.getCountry(),
//                getCountryCode(country).getData().getIso2(),
//                getCapital(country).getData().getCapital(),
//                getLatestPopulation(country),
//                getFlagAsURL(country).getData().getFlag()
//        );
//    }
}