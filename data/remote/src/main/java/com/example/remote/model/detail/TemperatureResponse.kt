package com.example.remote.model.detail

import com.google.gson.annotations.SerializedName

data class TemperatureResponse(
    @SerializedName("temp_min") val minTemp: Double,
    @SerializedName("temp_max") val maxTemp: Double
)
