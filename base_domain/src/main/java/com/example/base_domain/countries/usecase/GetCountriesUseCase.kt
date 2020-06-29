package com.example.base_domain.countries.usecase

import com.example.base_data.countries.data.repository.CountriesRepository
import com.example.base_domain.NoArgUseCase
import com.example.model.countries.CountriesDomainModel
import io.reactivex.Single
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(
    private val countriesRepository: CountriesRepository
) : NoArgUseCase<CountriesDomainModel> {

    override fun execute(): Single<CountriesDomainModel> {
        return countriesRepository.getCountries()
    }
}