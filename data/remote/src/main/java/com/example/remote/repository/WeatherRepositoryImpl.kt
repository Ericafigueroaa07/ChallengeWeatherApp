package com.example.remote.repository

import android.location.Location
import com.example.domain.WeatherRepository
import com.example.remote.datasource.WeatherDataSource
import com.example.remote.model.current.CurrentWeatherResponse

class WeatherRepositoryImpl(
    private val weatherDataSource: WeatherDataSource
) : WeatherRepository {

    override fun getCurrentWeather(location: Location): CurrentWeatherResponse {
        return weatherDataSource.getCurrentWeather(location)
    }
}