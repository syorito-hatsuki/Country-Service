import dto.CountryInfo
import dto.CountryName
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.engine.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class ApplicationTest {

    @Test
    fun testCountries() = testApplication {

        val client = createClient {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
        }

        application {
            module()
        }

        environment {
            connector {
                port = 1540
            }
        }

        val response = client.get("countries") {
            host = "0.0.0.0"
            port = 1540
        }

        assertEquals(HttpStatusCode.OK, response.status)
        assertIs<List<CountryName>>(response.body<List<CountryName>>())
    }

    @Test
    fun testFinlandCountry() = testApplication {

        val client = createClient {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
        }

        application {
            module()
        }

        environment {
            connector {
                port = 1540
            }
        }

        val response = client.get("countries/Finland") {
            host = "0.0.0.0"
            port = 1540
        }

        assertEquals(HttpStatusCode.OK, response.status)

        val countryInfo = response.body<CountryInfo>()

        assertEquals("Finland", countryInfo.name)
        assertEquals("FI", countryInfo.countryCode)
        assertEquals("Helsinki", countryInfo.capital)
        assertIs<Long>(countryInfo.population)
        assert(countryInfo.flagFileUrl.isNotEmpty())
    }
}