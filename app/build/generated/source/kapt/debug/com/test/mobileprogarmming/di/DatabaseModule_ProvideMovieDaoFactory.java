// Generated by Dagger (https://dagger.dev).
package com.test.mobileprogarmming.di;

import com.test.mobileprogarmming.data.local.AppDatabase;
import com.test.mobileprogarmming.data.local.UserDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMovieDaoFactory implements Factory<UserDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideMovieDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserDao get() {
    return provideMovieDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideMovieDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideMovieDaoFactory(appDatabaseProvider);
  }

  public static UserDao provideMovieDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideMovieDao(appDatabase));
  }
}
