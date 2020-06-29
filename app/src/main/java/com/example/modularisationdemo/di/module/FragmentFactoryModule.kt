package com.example.modularisationdemo.di.module

import com.example.feature_countries.countries.di.module.CountriesFragmentFactoryModule
import dagger.Module

@Module(
    includes = [
        CountriesFragmentFactoryModule::class
    ]
)
abstract class FragmentFactoryModule