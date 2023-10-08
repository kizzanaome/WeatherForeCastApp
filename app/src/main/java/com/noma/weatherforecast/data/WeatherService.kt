package com.noma.weatherforecast.data

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
//    https://api.openweathermap.org/data/2.5/weather?q=kampala&appid=7a7832296092ee52fb6badf906bd09fe
    @GET("/data/2.5/weather")
    suspend fun getWeather(@Query("q") cityName:String, @Query("appid") apiKey:String):WeatherResponse
}