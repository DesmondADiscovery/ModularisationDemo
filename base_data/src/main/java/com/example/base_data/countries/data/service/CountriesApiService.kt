package com.example.base_data.countries.data.service

import com.example.base_data.countries.data.model.CountriesEntity
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApiService {

    @GET("countries")
    fun getCountries() : Single<CountriesEntity>
}