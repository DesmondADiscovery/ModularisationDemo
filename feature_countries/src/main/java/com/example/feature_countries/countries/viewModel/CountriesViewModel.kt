package com.example.feature_countries.countries.viewModel

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.base_domain.countries.usecase.GetCountriesUseCase
import com.example.base_presentation.viewmodel.BaseViewModel
import com.example.base_presentation.viewmodel.SingleLiveEvent
import com.example.feature_countries.countries.model.Countries
import com.example.feature_countries.countries.model.Country
import com.example.feature_countries.countries.model.mapToPresentation
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CountriesViewModel @Inject constructor(
    private val getCountriesUseCase: GetCountriesUseCase,
    compositeDisposable: CompositeDisposable
) : BaseViewModel(
    compositeDisposable
) {

    private val screenStateLiveData = MutableLiveData<ScreenState>()
    val screenState: LiveData<ScreenState> = screenStateLiveData

    private val navigationLiveData = SingleLiveEvent<Navigation>()
    val navigation: LiveData<Navigation> = navigationLiveData

    init {
        getCountries()
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getCountries() {
        addDisposable(getCountriesUseCase.execute()
            .doOnSubscribe { screenStateLiveData.postValue(ScreenState.Loading) }
            .map {
                it.mapToPresentation()
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { onGetCountriesSuccess(it) }, { onGetCountriesError() }
            )
        )
    }

    private fun onGetCountriesSuccess(countries: Countries) {
        screenStateLiveData.postValue(ScreenState.Success(countries.countryList))
    }

    private fun onGetCountriesError() {
        screenStateLiveData.postValue(ScreenState.Error)
    }

    fun onCountryClicked(countryName: String) {
        navigationLiveData.postValue(Navigation.ToCovidStats(countryName))
    }

    sealed class ScreenState {
        object Error : ScreenState()
        object Loading : ScreenState()
        data class Success(val countryList: List<Country>) : ScreenState()
    }

    sealed class Navigation {
        data class ToCovidStats(val countryName: String) : Navigation()
    }


}