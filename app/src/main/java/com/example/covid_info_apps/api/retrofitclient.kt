package com.example.covid_info_apps.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitclient {
    private const val BASE_URL = "https://learn-retrofit-data.netlify.app"

    val instance: api by lazy{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(api::class.java)
    }
}