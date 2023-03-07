package com.example.moreapiexamples.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiModel(
    @Json(name = "name") val name: String,
    @Json(name = "species") val species: String
)
