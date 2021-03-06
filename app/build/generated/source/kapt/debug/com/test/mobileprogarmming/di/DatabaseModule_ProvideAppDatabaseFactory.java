// Generated by Dagger (https://dagger.dev).
package com.test.mobileprogarmming.di;

import android.content.Context;
import com.test.mobileprogarmming.data.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(appContextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(
      Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideAppDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAppDatabase(appContext));
  }
}
