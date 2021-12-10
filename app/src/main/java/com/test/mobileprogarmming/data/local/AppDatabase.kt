package com.test.mobileprogarmming.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.test.mobileprogarmming.data.GenreConverters
import com.test.mobileprogarmming.di.DatabaseModule
import com.test.mobileprogarmming.model.User
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@Database(entities = [User::class], version = 1)
@TypeConverters(GenreConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    class Callback @Inject constructor(@DatabaseModule.ApplicationScope private val applicationScope: CoroutineScope) : RoomDatabase.Callback(){
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
        }
    }
}