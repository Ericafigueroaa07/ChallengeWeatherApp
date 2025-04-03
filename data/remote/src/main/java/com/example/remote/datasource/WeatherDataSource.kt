package com.example.remote.datasource

import android.location.Location
import com.example.remote.model.current.CurrentWeatherResponse

interface WeatherDataSource {
    fun getCurrentWeather(location: Location) : CurrentWeatherResponse
}