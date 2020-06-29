package com.example.modularisationdemo.di.module

import com.example.base_data.countries.data.service.CountriesApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiServiceModule {

    @Provides
    @Singleton
    internal fun providesCountriesApiService(retrofit: Retrofit) : CountriesApiService {
        return retrofit.create(CountriesApiService::class.java)
    }
}