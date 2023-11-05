package dto.countriesnow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Flag(
    @SerialName("data") val data: Data,
    @SerialName("error") val error: Boolean,
    @SerialName("msg") val msg: String,
) {
    @Serializable
    data class Data(
        @SerialName("flag") val flag: String,
        @SerialName("iso2") val iso2: String,
        @SerialName("iso3") val iso3: String,
        @SerialName("name") val name: String,
    )
}