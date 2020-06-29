package com.example.feature_countries.countries.di.module

import com.example.feature_countries.countries.ui.CountriesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CountriesFragmentFactoryModule {

    @ContributesAndroidInjector
    abstract fun contributesCountriesFragment(): CountriesFragment

}