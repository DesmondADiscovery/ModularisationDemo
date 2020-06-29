package com.example.base_presentation.acvtivity

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import com.example.base_presentation.viewmodel.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModelProvider: ViewModelProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
        viewModelProvider = ViewModelProvider(this, viewModelFactory)
    }

    fun getViewModelProvider() = viewModelProvider

    @LayoutRes
    abstract fun layoutRes(): Int

}