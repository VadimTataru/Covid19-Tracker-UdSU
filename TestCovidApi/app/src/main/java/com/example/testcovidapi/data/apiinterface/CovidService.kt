package com.example.testcovidapi.data.apiinterface

import com.example.testcovidapi.data.responsedata.CovidData
import com.example.testcovidapi.data.responsedata.CountryData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface CovidService {

    @GET("us/daily.json")
    fun getNationalData(): Call<List<CovidData>>

    @GET("states/daily.json")
    fun getStatesData(): Call<List<CovidData>>

    @GET("countries")
    @Headers("Content-Type: application/json")
    fun getCountriesName(): Call<List<CountryData>>
    //api.covid19api.com/countries to get country names

    @GET("country/{country_name}")
    @Headers("Content-Type: application/json")
    fun getCountryData(@Path("country_name") country_name: String): Call<List<CovidData>>
    //api.covid19api.com/country/{country_name} to get data by country name

}