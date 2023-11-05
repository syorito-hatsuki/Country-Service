package dto

import kotlinx.serialization.Serializable

@Serializable
data class Countries(
    val countries: List<CountryName>
) {
    @Serializable
    data class CountryName(
        val name: String,
        val countryCode: String
    )
}
