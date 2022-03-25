package com.example.testcovidapi

import retrofit2.Call
import retrofit2.http.GET

interface CovidService {

    @GET("us/daily.json")
    fun getNationalData(): Call<List<CovidData>>

    @GET("states/daily.json")
    fun getStatesData(): Call<List<CovidData>>

    @GET("countries")
    fun getCountriesName(): Call<List<CovidData>>
    //api.covid19api.com/countries to get country names

    @GET("country/{country_name}")
    fun getCountryData(): Call<List<CovidData>>
    //api.covid19api.com/country/{country_name} to get data by country name

}