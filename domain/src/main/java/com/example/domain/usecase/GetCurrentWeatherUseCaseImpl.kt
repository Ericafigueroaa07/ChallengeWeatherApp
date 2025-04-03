package com.example.domain.usecase

import android.location.Location
import com.example.domain.WeatherRepository
import com.example.remote.model.current.CurrentWeatherResponse

class GetCurrentWeatherUseCaseImpl(
    private val weatherRepository: WeatherRepository
) : GetCurrentWeatherUseCase {

    override fun buildUseCase(location: Location): CurrentWeatherResponse {
        return weatherRepository.getCurrentWeather(location)
    }
}