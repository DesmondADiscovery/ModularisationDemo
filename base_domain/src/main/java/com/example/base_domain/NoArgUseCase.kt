package com.example.base_domain

import com.example.model.ResponseDomainModel
import io.reactivex.Single

interface NoArgUseCase<R: ResponseDomainModel> {
    fun execute(): Single<R>
}