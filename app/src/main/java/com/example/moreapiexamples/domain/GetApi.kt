package com.example.moreapiexamples.domain

import com.example.moreapiexamples.data.ApiModel
import com.example.moreapiexamples.service.ApiService
import javax.inject.Inject

class GetApi @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getApiList():List<ApiModel>{
        return apiService.getApiService()
    }
}