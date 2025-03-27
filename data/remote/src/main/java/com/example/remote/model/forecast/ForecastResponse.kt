package com.example.myweatherappdfnc.responses.forecast

import com.google.gson.annotations.SerializedName
data class ForecastResponse(
    @SerializedName("list") val dailyWeather: List<DailyWeatherResponse>,
)