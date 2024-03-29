package dto

import kotlinx.serialization.Serializable

@Serializable
data class CountryInfo(
    val name: String,
    val countryCode: String,
    val capital: String,
    val population: Long,
    val flagFileUrl: String,
)
