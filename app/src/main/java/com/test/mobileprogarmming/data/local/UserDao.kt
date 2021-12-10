package com.test.mobileprogarmming.data.local

import androidx.room.*
import com.test.mobileprogarmming.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<User>)

    @Delete
    fun delete(user: User)

    @Delete
    fun deleteAll(users: List<User>)
}