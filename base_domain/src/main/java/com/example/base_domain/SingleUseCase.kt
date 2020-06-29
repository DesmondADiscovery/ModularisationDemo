package com.example.base_domain

import com.example.model.ResponseDomainModel
import io.reactivex.Single

interface SingleUseCase<A : SingleUseCase.RequestArgs, R: ResponseDomainModel> {

    fun execute(requestArg: A): Single<R>

    interface RequestArgs
}