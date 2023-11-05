package dto.countriesnow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Iso(
    @SerialName("data") val data: List<Data>,
    @SerialName("error") val error: Boolean,
    @SerialName("msg") val msg: String,
) {
    @Serializable
    data class Data(
        @SerialName("Iso2") val iso2: String,
        @SerialName("Iso3") val iso3: String,
        @SerialName("name") val name: String,
    )
}