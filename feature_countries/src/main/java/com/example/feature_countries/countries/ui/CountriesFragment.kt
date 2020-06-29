package com.example.feature_countries.countries.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.base_presentation.fragment.BaseFragment
import com.example.feature_countries.R
import com.example.feature_countries.countries.model.Country
import com.example.feature_countries.countries.ui.adapter.CountriesAdapter
import com.example.feature_countries.countries.viewModel.CountriesViewModel
import com.example.feature_countries.countries.viewModel.CountriesViewModel.ScreenState
import kotlinx.android.synthetic.main.fragment_countries.*

class CountriesFragment : BaseFragment() {

    private lateinit var viewModel: CountriesViewModel

    override fun layoutRes(): Int = R.layout.fragment_countries

    private val countriesAdapter: CountriesAdapter by lazy {
        CountriesAdapter()
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
        viewModelProvider: ViewModelProvider
    ) {
        viewModel = viewModelProvider[CountriesViewModel::class.java]

        setupViews()
        setupViewModel()
        setupListeners()
    }


    override fun onBackPressed() {
        requireActivity().finish()
    }

    private fun setupViews() {
        with(rv_countries) {
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(
                DividerItemDecoration(
                    requireContext(),
                    DividerItemDecoration.VERTICAL
                )
            )
            adapter = countriesAdapter
        }
    }

    private fun setupViewModel() {
        with(viewModel) {
            screenState.observe(
                viewLifecycleOwner,
                Observer { screenState ->
                    onScreenState(screenState)
                }
            )
            navigation.observe(
                viewLifecycleOwner,
                Observer { navigation ->
                    onNavigation(navigation)
                }
            )
        }
    }

    private fun setupListeners() {
        countriesAdapter.setListener(object : CountriesAdapter.OnCountryClickedListener {
            override fun onCountryClicked(countryName: String) {
                viewModel.onCountryClicked(countryName)
            }
        })
    }

    private fun onScreenState(screenState: ScreenState?) {
        when (screenState) {
            ScreenState.Error -> onError()
            is ScreenState.Loading -> onLoading()
            is ScreenState.Success -> onSucess(screenState.countryList)
        }
    }

    private fun onError() {
        pb_progress_bar.isVisible = false
        Toast.makeText(requireContext(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show()
    }

    private fun onLoading() {
        pb_progress_bar.isVisible = true
    }

    private fun onSucess(countryList: List<Country>) {
        pb_progress_bar.isVisible = false
        countriesAdapter.setItems(countryList)
    }

    private fun onNavigation(navigation: CountriesViewModel.Navigation?) {
        when(navigation) {
            is CountriesViewModel.Navigation.ToCovidStats -> onShowCovidStats(navigation.countryName)
        }
    }

    private fun onShowCovidStats(countryName: String) {
        // Todo
    }
}