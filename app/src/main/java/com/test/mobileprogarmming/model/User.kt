package com.test.mobileprogarmming.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class User(
    @NonNull
    @PrimaryKey
    val id: Int,
    val name: String,
    val email: String,
    val gender: String,
    val status: String
){}
