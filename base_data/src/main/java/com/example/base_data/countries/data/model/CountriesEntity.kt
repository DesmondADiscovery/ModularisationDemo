package com.example.base_data.countries.data.model


import com.example.base_data.ResponseEntity
import com.example.model.countries.CountriesDomainModel
import com.example.model.countries.CountryDomainModel
import com.google.gson.annotations.SerializedName

data class CountriesEntity(
    @SerializedName("response")
    val countries: List<String>?
) : ResponseEntity() {

    override fun mapToDomain(): CountriesDomainModel {
        return CountriesDomainModel(
            countries?.map { CountryDomainModel(it) } ?: listOf()
        )
    }
}