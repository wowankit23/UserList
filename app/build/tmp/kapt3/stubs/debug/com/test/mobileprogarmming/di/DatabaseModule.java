package com.test.mobileprogarmming.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/test/mobileprogarmming/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/test/mobileprogarmming/data/local/AppDatabase;", "appContext", "Landroid/content/Context;", "provideMovieDao", "Lcom/test/mobileprogarmming/data/local/UserDao;", "appDatabase", "ApplicationScope", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.mobileprogarmming.di.DatabaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.mobileprogarmming.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.mobileprogarmming.data.local.UserDao provideMovieDao(@org.jetbrains.annotations.NotNull()
    com.test.mobileprogarmming.data.local.AppDatabase appDatabase) {
        return null;
    }
    
    private DatabaseModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/test/mobileprogarmming/di/DatabaseModule$ApplicationScope;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    public static abstract @interface ApplicationScope {
    }
}