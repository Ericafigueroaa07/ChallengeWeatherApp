package com.example.remote

import com.example.myweatherappdfnc.responses.forecast.ForecastResponse
import com.example.remote.model.current.CurrentWeatherResponse
import com.example.remote.model.detail.DetailedWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherServices {
    @GET("weather")
    fun getCurrentWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String
    ): Response<CurrentWeatherResponse>

    @GET("onecall")
    fun getDetailedWeatherData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String,
        @Query("exclude") exclude: String = "current,minutely"
    ): Response<DetailedWeatherResponse>

    @GET("forecast")
    fun getForecastData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String,
        @Query("exclude") exclude: String = "current,minutely"
    ): Response<ForecastResponse>
}