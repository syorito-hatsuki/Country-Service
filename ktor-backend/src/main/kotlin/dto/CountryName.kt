package dto

import kotlinx.serialization.Serializable

@Serializable
data class CountryName(
    val name: String,
    val countryCode: String,
)
