package com.example.core.helpers

import javax.inject.Singleton

private const val BASE_URL_COVID_STATS = "https://covid-193.p.rapidapi.com/"
private const val HEADER_NAME = "X-RAPIDAPI-KEY"
private const val HEADER_VALUE = "0f31154116msh40439421e0bf0bep1068fdjsn82a57be2a0cc"

@Singleton
class ApiHelper {

    val countyCovidStatsHistory = BASE_URL_COVID_STATS

    fun getHeader() : Pair<String, String> {
        return Pair(HEADER_NAME, HEADER_VALUE)
    }

    fun getBaseUrl() = BASE_URL_COVID_STATS
}