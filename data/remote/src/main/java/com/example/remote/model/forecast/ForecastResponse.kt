package com.example.remote.model.forecast

import com.example.myweatherappdfnc.responses.forecast.DailyWeatherResponse

import com.google.gson.annotations.SerializedName
data class ForecastResponse(
    @SerializedName("list") val dailyWeather: List<DailyWeatherResponse>,
)