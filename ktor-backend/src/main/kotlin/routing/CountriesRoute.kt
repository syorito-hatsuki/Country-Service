package routing

import api.CountriesNowAPI
import dto.CountryInfo
import dto.CountryName
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Route.countriesRoute() {
    route("countries") {
        get {
            call.respond(CountriesNowAPI.getCountries().data.map {
                CountryName(it.name, it.iso2)
            })
        }

        get("{name}") {
            val name = call.parameters.getOrFail("name")
            val api = CountriesNowAPI
            call.respond(
                CountryInfo(
                    name,
                    api.getCountryCode(name).data.iso2,
                    api.getCapital(name).data.capital,
                    api.getPopulation(name).data.populationCounts.last().value,
                    api.getFlag(name).data.flag
                )
            )
        }
    }
}