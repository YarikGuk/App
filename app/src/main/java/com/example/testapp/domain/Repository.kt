package com.example.testapp.domain

import com.example.testapp.data.models.UserRequest
import com.example.testapp.data.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body

interface Repository {

    suspend fun signIn(@Body userRequest: UserRequest): UserResponse

    suspend fun signUp(@Body userRequest: UserRequest): UserResponse
}