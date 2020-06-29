package com.example.base_domain

import com.example.model.ResponseDomainModel
import io.reactivex.Maybe

interface MaybeUseCase<A: MaybeUseCase.RequestArgs, R: ResponseDomainModel> {

    fun execute(requestArgs: A) : Maybe<R>

    interface RequestArgs
}