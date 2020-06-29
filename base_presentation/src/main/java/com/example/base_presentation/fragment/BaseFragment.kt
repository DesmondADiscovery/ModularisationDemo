package com.example.base_presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.base_presentation.viewmodel.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject


abstract class BaseFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModelProvider: ViewModelProvider

    private lateinit var onBackPressedCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutRes(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelProvider = ViewModelProvider(this, viewModelFactory)
        onViewCreated(view, savedInstanceState, viewModelProvider)
    }

    override fun onResume() {
        super.onResume()
        registerBackPressedListener()
    }

    override fun onPause() {
        super.onPause()
        onBackPressedCallback.remove()
    }

    private fun registerBackPressedListener() {
        onBackPressedCallback =
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
                if (isEnabled) {
                    onBackPressed()
                }
            }
    }

    fun navigateUp() {
        findNavController().navigateUp()
    }

    @LayoutRes
    abstract fun layoutRes(): Int

    abstract fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
        viewModelProvider: ViewModelProvider
    )

    abstract fun onBackPressed()

}