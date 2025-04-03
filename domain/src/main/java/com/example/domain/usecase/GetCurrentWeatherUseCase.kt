package com.example.domain.usecase

import android.location.Location
import com.example.remote.model.current.CurrentWeatherResponse

interface GetCurrentWeatherUseCase {
    fun buildUseCase(location: Location): CurrentWeatherResponse
}