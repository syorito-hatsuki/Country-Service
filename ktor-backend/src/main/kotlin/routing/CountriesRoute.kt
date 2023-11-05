package routing

import dto.Countries
import dto.Country
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.countriesRoute() {
    route("countries") {
        get {
            call.respond(
                Countries(
                    emptyList()
                )
            )
        }

        get("{name}") {
            call.respond(
                Country(
                    "",
                    "",
                    "",
                    0,
                    ""
                )
            )
        }
    }
}