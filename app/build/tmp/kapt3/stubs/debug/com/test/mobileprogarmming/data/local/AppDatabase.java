package com.test.mobileprogarmming.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.test.mobileprogarmming.data.GenreConverters.class})
@androidx.room.Database(entities = {com.test.mobileprogarmming.model.User.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/mobileprogarmming/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/test/mobileprogarmming/data/local/UserDao;", "Callback", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.test.mobileprogarmming.data.local.UserDao userDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/test/mobileprogarmming/data/local/AppDatabase$Callback;", "Landroidx/room/RoomDatabase$Callback;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class Callback extends androidx.room.RoomDatabase.Callback {
        private final kotlinx.coroutines.CoroutineScope applicationScope = null;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
        
        @javax.inject.Inject()
        public Callback(@org.jetbrains.annotations.NotNull()
        @com.test.mobileprogarmming.di.DatabaseModule.ApplicationScope()
        kotlinx.coroutines.CoroutineScope applicationScope) {
            super();
        }
    }
}