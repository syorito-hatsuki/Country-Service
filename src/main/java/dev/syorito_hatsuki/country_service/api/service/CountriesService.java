package dev.syorito_hatsuki.country_service.api.service;

import dev.syorito_hatsuki.country_service.api.model.capital.Capital;
import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.countries.response.CountryInfo;
import dev.syorito_hatsuki.country_service.api.model.country_code.response.CountryCode;
import dev.syorito_hatsuki.country_service.api.model.flag.response.Flag;
import dev.syorito_hatsuki.country_service.api.model.population.request.Country;
import dev.syorito_hatsuki.country_service.api.model.population.responce.Population;
import dev.syorito_hatsuki.country_service.api.repo.CountriesInterface;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class CountriesService {

    CountriesInterface service;

    public CountriesService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://countriesnow.space/api/v0.1/countries/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(CountriesInterface.class);
    }

    public Countries getCountries() throws IOException {

        Response<Countries> response = service.getCountries().execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    private CountryCode getCountryCode(Country country) throws IOException {

        Response<CountryCode> response = service.getCountryCode(country).execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    private Capital getCapital(Country country) throws IOException {

        Response<Capital> response = service.getCapital(country).execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    private Integer getLatestPopulation(Country country) throws IOException {

        Response<Population> response = service.getPopulation(country).execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        assert response.body() != null;
        var body = response.body().getData().getPopulationCounts();
        return body.get(body.size() - 1).getValue();
    }

    private Flag getFlagAsURL(Country country) throws IOException {

        Response<Flag> response = service.getFlagImage(country).execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    public CountryInfo getCountryInfo(Country country) throws IOException {
        return new CountryInfo(
                country.getCountry(),
                getCountryCode(country).getData().getIso2(),
                getCapital(country).getData().getCapital(),
                getLatestPopulation(country),
                getFlagAsURL(country).getData().getFlag()
        );
    }
}