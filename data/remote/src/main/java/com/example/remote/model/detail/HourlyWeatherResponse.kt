package com.example.remote.model.detail

import com.example.remote.model.WeatherResponse
import com.google.gson.annotations.SerializedName

data class HourlyWeatherResponse(
    @SerializedName("dt") val date: Long,
    @SerializedName("temp") val temp: Double,
    @SerializedName("weather") val weather: List<WeatherResponse>
)