package com.example.moreapiexamples

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moreapiexamples.data.ApiModel
import com.example.moreapiexamples.domain.GetApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getApi: GetApi
):ViewModel() {
    private val stateApi=MutableStateFlow(emptyList<ApiModel>())
    val state : StateFlow<List<ApiModel>> = stateApi

    init {
        viewModelScope.launch {
            val api = getApi.getApiList()
            stateApi.value = api
        }
    }
}