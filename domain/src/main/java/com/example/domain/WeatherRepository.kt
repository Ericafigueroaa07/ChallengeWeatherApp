package com.example.domain

import android.location.Location
import com.example.remote.model.current.CurrentWeatherResponse

interface WeatherRepository {
    fun getCurrentWeather(location: Location): CurrentWeatherResponse
}