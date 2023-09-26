package com.example.testapp.data

import com.example.testapp.data.models.UserRequest
import com.example.testapp.data.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

interface Service {

    @GET("/api/account/signin")
    suspend fun signIn(@Body userRequest: UserRequest): Response<UserResponse>

    @GET("/api/account/signup")
    suspend fun signUp(@Body userRequest: UserRequest): Response<UserResponse>
}