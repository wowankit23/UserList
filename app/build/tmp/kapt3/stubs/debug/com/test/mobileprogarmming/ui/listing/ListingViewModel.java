package com.test.mobileprogarmming.ui.listing;

import java.lang.System;

/**
 * ViewModel for ListingActivity
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/test/mobileprogarmming/ui/listing/ListingViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/test/mobileprogarmming/data/UserRepository;", "userDao", "Lcom/test/mobileprogarmming/data/local/UserDao;", "(Lcom/test/mobileprogarmming/data/UserRepository;Lcom/test/mobileprogarmming/data/local/UserDao;)V", "_userList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/mobileprogarmming/model/Result;", "Lcom/test/mobileprogarmming/model/UserResponse;", "userList", "getUserList", "()Landroidx/lifecycle/MutableLiveData;", "deleteUser", "", "user", "Lcom/test/mobileprogarmming/model/User;", "fetchUsers", "app_debug"})
public final class ListingViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse>> _userList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse>> userList = null;
    private final com.test.mobileprogarmming.data.UserRepository userRepository = null;
    private final com.test.mobileprogarmming.data.local.UserDao userDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.mobileprogarmming.model.Result<com.test.mobileprogarmming.model.UserResponse>> getUserList() {
        return null;
    }
    
    public final void fetchUsers() {
    }
    
    public final void deleteUser(@org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.model.User user) {
    }
    
    @javax.inject.Inject()
    public ListingViewModel(@org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.data.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.data.local.UserDao userDao) {
        super();
    }
}