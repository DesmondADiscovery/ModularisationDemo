package com.example.feature_countries.countries.model

import com.example.model.countries.CountriesDomainModel
import com.example.model.countries.CountryDomainModel

data class Country(
    val name: String
)

data class Countries(
    val countryList: List<Country>
)

fun CountriesDomainModel.mapToPresentation(): Countries {
    return Countries(
        countries.map { it.mapToPresentation() }
    )
}

fun CountryDomainModel.mapToPresentation(): Country {
    return Country(countryName)
}