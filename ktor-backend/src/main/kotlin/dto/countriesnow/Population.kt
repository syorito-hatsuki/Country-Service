package dto.countriesnow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Population(
    @SerialName("data")
    val data: Data,
    @SerialName("error")
    val error: Boolean,
    @SerialName("msg")
    val msg: String
) {
    @Serializable
    data class Data(
        @SerialName("code")
        val code: String,
        @SerialName("country")
        val country: String,
        @SerialName("iso3")
        val iso3: String,
        @SerialName("populationCounts")
        val populationCounts: List<PopulationCount>
    ) {
        @Serializable
        data class PopulationCount(
            @SerialName("value")
            val value: Int,
            @SerialName("year")
            val year: Int
        )
    }
}