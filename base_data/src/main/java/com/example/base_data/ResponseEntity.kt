package com.example.base_data

import com.example.model.ResponseDomainModel
import com.google.gson.annotations.SerializedName

const val OK = "OK"

open class ResponseEntity(
    @SerializedName("status")
    val status: String = ""
)  : Entity {

    fun isSuccess() = status == OK

    override fun mapToDomain(): ResponseDomainModel = ResponseDomainModel()
}