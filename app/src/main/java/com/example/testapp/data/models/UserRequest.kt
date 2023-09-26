package com.example.testapp.data.models

import com.squareup.moshi.Json

data class UserRequest(
    @Json(name = "login") val login: String?= null,
    @Json(name = "password")val password: String?= null
)
