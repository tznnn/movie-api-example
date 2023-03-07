package com.example.moreapiexamples.service

import com.example.moreapiexamples.ApiConstants.END_POINT
import com.example.moreapiexamples.data.ApiModel
import retrofit2.http.GET

interface ApiService {

    @GET(END_POINT)
    suspend fun getApiService():List<ApiModel>
}