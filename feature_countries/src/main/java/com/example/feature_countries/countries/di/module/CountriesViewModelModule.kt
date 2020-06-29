package com.example.feature_countries.countries.di.module

import androidx.lifecycle.ViewModel
import com.example.base_presentation.viewmodel.ViewModelKey
import com.example.feature_countries.countries.viewModel.CountriesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CountriesViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CountriesViewModel::class)
    abstract fun bindCountriesViewModel(viewModel: CountriesViewModel): ViewModel
}