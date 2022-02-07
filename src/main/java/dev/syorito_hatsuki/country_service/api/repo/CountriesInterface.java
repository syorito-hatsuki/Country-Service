package dev.syorito_hatsuki.country_service.api.repo;

import dev.syorito_hatsuki.country_service.api.model.capital.Capital;
import dev.syorito_hatsuki.country_service.api.model.countries.response.Countries;
import dev.syorito_hatsuki.country_service.api.model.country_code.response.CountryCode;
import dev.syorito_hatsuki.country_service.api.model.flag.response.Flag;
import dev.syorito_hatsuki.country_service.api.model.population.request.Country;
import dev.syorito_hatsuki.country_service.api.model.population.responce.Population;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CountriesInterface {
    @GET("iso")
    Call<Countries> getCountries();

    @POST("population")
    Call<Population> getPopulation(@Body Country country);

    @POST("flag/images")
    Call<Flag> getFlagImage(@Body Country country);

    @POST("capital")
    Call<Capital> getCapital(@Body Country country);

    @POST("iso")
    Call<CountryCode> getCountryCode(@Body Country country);

}
