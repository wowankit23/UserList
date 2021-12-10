package com.test.mobileprogarmming.data.remote

import com.test.mobileprogarmming.model.Result
import com.test.mobileprogarmming.model.UserResponse
import com.test.mobileprogarmming.network.UserService
import com.test.mobileprogarmming.utility.ErrorUtils
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * fetches data from remote source
 */
class UserRemoteDataSource @Inject constructor(private val retrofit: Retrofit) {

    suspend fun fetchUsers(): Result<UserResponse> {
        val userService = retrofit.create(UserService::class.java);
        return getResponse(
            request = { userService.getUsers() },
            defaultErrorMessage = "Error fetching User list")

    }



    private suspend fun <T> getResponse(request: suspend () -> Response<T>, defaultErrorMessage: String): Result<T> {
        return try {
            println("I'm working in thread ${Thread.currentThread().name}")
            val result = request.invoke()
            if (result.isSuccessful) {
                return Result.success(result.body())
            } else {
                val errorResponse = ErrorUtils.parseError(result, retrofit)
                Result.error(errorResponse?.status_message ?: defaultErrorMessage, errorResponse)
            }
        } catch (e: Throwable) {
            Result.error("Unknown Error", null)
        }
    }
}