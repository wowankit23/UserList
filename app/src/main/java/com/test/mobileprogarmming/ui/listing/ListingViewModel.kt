package com.test.mobileprogarmming.ui.listing

import android.os.AsyncTask
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.mobileprogarmming.data.UserRepository
import com.test.mobileprogarmming.data.local.UserDao
import com.test.mobileprogarmming.model.Result
import com.test.mobileprogarmming.model.User
import com.test.mobileprogarmming.model.UserResponse
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for ListingActivity
 */
@HiltViewModel
public class ListingViewModel @Inject  constructor(private val userRepository: UserRepository,private val userDao: UserDao) :
    ViewModel() {

    private val _userList = MutableLiveData<Result<UserResponse>>()
    val userList = _userList

    init {
        fetchUsers()
    }

     fun fetchUsers() {
        viewModelScope.launch {
            userRepository.fetchUsers().collect {
                _userList.value = it
            }
        }
    }

    fun deleteUser(user:User){
        Thread {
            userDao.delete(user)
        }.start()
    }


}