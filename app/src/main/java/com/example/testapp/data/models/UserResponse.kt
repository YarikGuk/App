package com.example.testapp.data.models

import com.squareup.moshi.Json

data class UserResponse(
    @Json(name = "login") val login: String?= null,
    @Json(name = "userId") val userId: String?= null,
    @Json(name = "token") val token: String?= null
)
