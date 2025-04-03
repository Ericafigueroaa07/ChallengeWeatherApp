package com.example.remote.datasource

import android.location.Location
import com.example.common.RetrofitHelper
import com.example.remote.model.current.CurrentWeatherResponse
import com.example.remote.network.WeatherApiClient
import com.example.remote.util.RemoteConstants.Companion.WEATHER_API_KEY

class WeatherDataSourceImpl : WeatherDataSource {

    private val retrofit = RetrofitHelper.getRetrofit()

    override fun getCurrentWeather(location: Location) : CurrentWeatherResponse {
        val response = retrofit.create(WeatherApiClient::class.java).getCurrentWeather(
            latitude = location.latitude,
            longitude = location.longitude,
            apiKey = WEATHER_API_KEY
        )
        return response.body() ?: throw IllegalArgumentException("La respuesta del clima actual es nula.")
    }
}