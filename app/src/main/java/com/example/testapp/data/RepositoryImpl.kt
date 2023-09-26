package com.example.testapp.data

import com.example.testapp.data.models.UserRequest
import com.example.testapp.data.models.UserResponse
import com.example.testapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    service: Service
) : Repository {
    override suspend fun signIn(userRequest: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(userRequest: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

}