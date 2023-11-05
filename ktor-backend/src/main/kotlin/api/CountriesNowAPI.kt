package api

import dto.countriesnow.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object CountriesNowAPI {
    private val httpClient = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
        defaultRequest {
            url("https://countriesnow.space/api/v0.1/countries/")
            userAgent("dev.syorito_hatsuki.country_service")
            contentType(ContentType.Application.Json)
        }
    }

    suspend fun getCapital(countryName: String): Capital = httpClient.get("capital/q?country=${countryName}").body()

    suspend fun getCountries(): Iso = httpClient.get("iso").body()

    suspend fun getCountryCode(countryName: String): Country = httpClient.get("iso/q?country=${countryName}").body()

    suspend fun getFlag(countryName: String): Flag = httpClient.get("flag/images/q?country=${countryName}").body()

    suspend fun getPopulation(countryName: String): Population =
        httpClient.get("population/q?country=${countryName}").body()
}