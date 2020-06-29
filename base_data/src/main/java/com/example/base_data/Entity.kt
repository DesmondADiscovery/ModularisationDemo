package com.example.base_data

import com.example.model.ResponseDomainModel


interface Entity {
    fun mapToDomain() : ResponseDomainModel
}