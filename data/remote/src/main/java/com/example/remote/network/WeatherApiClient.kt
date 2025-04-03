package com.example.remote.network

import com.example.remote.model.forecast.ForecastResponse
import com.example.remote.model.current.CurrentWeatherResponse
import com.example.remote.model.detail.DetailedWeatherResponse
import com.example.remote.util.RemoteConstants.Companion.FORECAST
import com.example.remote.util.RemoteConstants.Companion.ONE_CALL
import com.example.remote.util.RemoteConstants.Companion.WEATHER
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiClient {
    @GET(WEATHER)
    fun getCurrentWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String
    ): Response<CurrentWeatherResponse>

    @GET(ONE_CALL)
    fun getDetailedWeatherData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String,
        @Query("exclude") exclude: String = "current,minutely"
    ): Response<DetailedWeatherResponse>

    @GET(FORECAST)
    fun getForecastData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String,
        @Query("exclude") exclude: String = "current,minutely"
    ): Response<ForecastResponse>
}