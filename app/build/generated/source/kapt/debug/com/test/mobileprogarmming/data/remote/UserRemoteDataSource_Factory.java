// Generated by Dagger (https://dagger.dev).
package com.test.mobileprogarmming.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRemoteDataSource_Factory implements Factory<UserRemoteDataSource> {
  private final Provider<Retrofit> retrofitProvider;

  public UserRemoteDataSource_Factory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserRemoteDataSource get() {
    return newInstance(retrofitProvider.get());
  }

  public static UserRemoteDataSource_Factory create(Provider<Retrofit> retrofitProvider) {
    return new UserRemoteDataSource_Factory(retrofitProvider);
  }

  public static UserRemoteDataSource newInstance(Retrofit retrofit) {
    return new UserRemoteDataSource(retrofit);
  }
}
