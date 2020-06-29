package com.example.modularisationdemo.di.module

import com.example.base_data.Repository
import com.example.base_data.countries.data.repository.CountriesRepository
import com.example.base_data.countries.data.repository.CountriesRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    internal abstract fun bindsCountriesRepository(countriesRepository: CountriesRepositoryImpl) : CountriesRepository

}