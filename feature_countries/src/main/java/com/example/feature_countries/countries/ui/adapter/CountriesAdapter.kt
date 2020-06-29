package com.example.feature_countries.countries.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_countries.R
import com.example.feature_countries.countries.model.Country
import kotlinx.android.synthetic.main.country_list_item.view.*

class CountriesAdapter : RecyclerView.Adapter<CountriesViewHolder>() {

    interface OnCountryClickedListener {
        fun onCountryClicked(countryName: String)
    }

    private lateinit var listener: OnCountryClickedListener

    private var countriesList = mutableListOf<Country>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        return CountriesViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.country_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int = countriesList.size

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        val country = countriesList[position]
        holder.bind(country.name, listener)
    }

    fun setItems(newItems: List<Country>) {
        if (countriesList.isNotEmpty()) {
            countriesList.clear()
        }
        countriesList.addAll(newItems)
        notifyDataSetChanged()
    }

    fun setListener(countryClickedListener: OnCountryClickedListener) {
        this.listener = countryClickedListener
    }
}

class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(
        countryName: String,
        listener: CountriesAdapter.OnCountryClickedListener
    ) {
        with(itemView) {
            tv_country.text = countryName

            setOnClickListener {
                listener.onCountryClicked(countryName)
            }
        }
    }
}
