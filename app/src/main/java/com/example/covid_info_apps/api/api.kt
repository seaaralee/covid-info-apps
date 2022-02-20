package com.example.covid_info_apps.api

import com.example.covid_info_apps.model.IndonesiaResponse
import com.example.covid_info_apps.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}