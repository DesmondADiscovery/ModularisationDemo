package com.example.base_presentation.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import javax.inject.Inject

open class BaseViewModel @Inject constructor(
    private val compositeDisposable: CompositeDisposable
) : ViewModel() {

    protected fun addDisposable(disposable: Disposable) {
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.add(disposable)
        }
    }

    override fun onCleared() {
        super.onCleared()
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.dispose()
        }
    }
}