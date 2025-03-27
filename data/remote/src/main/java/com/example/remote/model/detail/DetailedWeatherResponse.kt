package com.example.remote.model.detail

import com.google.gson.annotations.SerializedName

data class DetailedWeatherResponse(
    @SerializedName("hourly") val hourlyWeather: List<HourlyWeatherResponse>,
)