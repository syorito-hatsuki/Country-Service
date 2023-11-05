package plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import routing.countriesRoute

fun Application.configureRouting() {
    routing {
        countriesRoute()
    }
}