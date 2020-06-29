package com.example.model.countries

import com.example.model.ResponseDomainModel

data class CountriesDomainModel(
    val countries: List<CountryDomainModel> = listOf()
) : ResponseDomainModel()

data class CountryDomainModel(
    val countryName: String = ""
) : ResponseDomainModel()

