package com.test.mobileprogarmming.data.remote;

import java.lang.System;

/**
 * fetches data from remote source
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJI\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006\"\u0004\b\u0000\u0010\n2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/test/mobileprogarmming/data/remote/UserRemoteDataSource;", "", "retrofit", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)V", "fetchUsers", "Lcom/test/mobileprogarmming/model/Result;", "Lcom/test/mobileprogarmming/model/UserResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResponse", "T", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "defaultErrorMessage", "", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRemoteDataSource {
    private final retrofit2.Retrofit retrofit = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRemoteDataSource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        super();
    }
}