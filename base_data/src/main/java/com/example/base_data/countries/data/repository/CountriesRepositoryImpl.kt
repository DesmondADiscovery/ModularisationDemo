package com.example.base_data.countries.data.repository

import com.example.base_data.countries.data.service.CountriesApiService
import com.example.model.countries.CountriesDomainModel
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CountriesRepositoryImpl @Inject constructor(
    private val countriesApiService: CountriesApiService
) : CountriesRepository {

    override fun getCountries(): Single<CountriesDomainModel> {
        return countriesApiService.getCountries()
            .map { it.mapToDomain() }
    }
}