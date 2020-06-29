package com.example.base_data.countries.data.repository

import com.example.base_data.Repository
import com.example.model.countries.CountriesDomainModel
import io.reactivex.Single


interface CountriesRepository : Repository {

    fun getCountries() : Single<CountriesDomainModel>
}