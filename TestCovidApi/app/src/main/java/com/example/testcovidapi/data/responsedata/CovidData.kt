package com.example.testcovidapi.data.responsedata

import com.google.gson.annotations.SerializedName
import java.util.*

data class CovidData(
    @SerializedName("Date") val dateChecked: Date,
    @SerializedName("Recovered") val positiveIncrease: Int,
    @SerializedName("Confirmed")  val negativeIncrease: Int,
    @SerializedName("Deaths") val deathIncrease: Int,
    @SerializedName("Country") val state: String
)
