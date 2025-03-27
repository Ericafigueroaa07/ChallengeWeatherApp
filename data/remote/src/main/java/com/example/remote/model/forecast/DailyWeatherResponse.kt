package com.example.myweatherappdfnc.responses.forecast

import com.example.remote.model.WeatherResponse
import com.example.remote.model.WindResponse
import com.example.remote.model.detail.TemperatureResponse
import com.google.gson.annotations.SerializedName

data class DailyWeatherResponse(
    @SerializedName("dt") val date: Long,
    @SerializedName("main") val temp: TemperatureResponse,
    @SerializedName("weather") val weather: List<WeatherResponse>,
    @SerializedName("wind") val wind: WindResponse
)
