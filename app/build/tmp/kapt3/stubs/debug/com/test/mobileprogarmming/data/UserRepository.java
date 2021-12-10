package com.test.mobileprogarmming.data;

import java.lang.System;

/**
 * Repository which fetches data from Remote or Local data sources
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/test/mobileprogarmming/data/UserRepository;", "", "userRemoteDataSource", "Lcom/test/mobileprogarmming/data/remote/UserRemoteDataSource;", "userDao", "Lcom/test/mobileprogarmming/data/local/UserDao;", "(Lcom/test/mobileprogarmming/data/remote/UserRemoteDataSource;Lcom/test/mobileprogarmming/data/local/UserDao;)V", "fetchUserCached", "Lcom/test/mobileprogarmming/model/Result;", "Lcom/test/mobileprogarmming/model/UserResponse;", "fetchUsers", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository {
    private final com.test.mobileprogarmming.data.remote.UserRemoteDataSource userRemoteDataSource = null;
    private final com.test.mobileprogarmming.data.local.UserDao userDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse>>> p0) {
        return null;
    }
    
    private final com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse> fetchUserCached() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.data.remote.UserRemoteDataSource userRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.data.local.UserDao userDao) {
        super();
    }
}