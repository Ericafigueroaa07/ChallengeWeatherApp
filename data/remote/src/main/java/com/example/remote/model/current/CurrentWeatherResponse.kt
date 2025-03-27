package com.example.remote.model.current

import com.example.remote.model.WeatherResponse
import com.example.remote.model.WindResponse
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("weather")
    var weather: List<WeatherResponse>? = null,

    @SerializedName("main")
    var main: MainWeatherResponse? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("dt")
    var date: Long? = null,

    @SerializedName("wind")
    var wind: WindResponse? = null,
)