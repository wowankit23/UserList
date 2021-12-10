package com.test.mobileprogarmming.network

import com.test.mobileprogarmming.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Retrofit API Service
 */
interface UserService {

    @GET("users")
    suspend fun getUsers() : Response<UserResponse>

   }