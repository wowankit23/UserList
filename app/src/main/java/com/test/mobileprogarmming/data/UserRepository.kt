package com.test.mobileprogarmming.data

import com.test.mobileprogarmming.data.local.UserDao
import com.test.mobileprogarmming.data.remote.UserRemoteDataSource
import com.test.mobileprogarmming.model.UserResponse

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import com.test.mobileprogarmming.model.Result
import com.test.mobileprogarmming.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

/**
 * Repository which fetches data from Remote or Local data sources
 */
@ExperimentalCoroutinesApi
class UserRepository @Inject constructor(
    private val userRemoteDataSource: UserRemoteDataSource,
    private val userDao: UserDao
) {

    suspend fun fetchUsers(): Flow<Result<UserResponse>?> {
        return flow {
            emit(fetchUserCached())
            emit(Result.loading())
            val result = userRemoteDataSource.fetchUsers()

            //Cache to database if response is successful
            if (result.status == Result.Status.SUCCESS) {
                result.data?.data?.let { it ->
                    userDao.deleteAll(it)
                    userDao.insertAll(it)
                }
            }
            emit(result)
        }.flowOn(Dispatchers.IO)
    }

    private fun fetchUserCached(): Result<UserResponse>? =
        userDao.getAll()?.let {
            Result.success(UserResponse(it))
        }


}
