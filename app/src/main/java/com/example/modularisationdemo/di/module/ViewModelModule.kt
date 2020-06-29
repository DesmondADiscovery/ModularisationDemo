package com.example.modularisationdemo.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.base_presentation.viewmodel.ViewModelFactory
import com.example.feature_countries.countries.di.module.CountriesViewModelModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        CountriesViewModelModule::class
    ]
)
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory
}