// Generated by Dagger (https://dagger.dev).
package com.test.mobileprogarmming.ui.listing;

import com.test.mobileprogarmming.data.UserRepository;
import com.test.mobileprogarmming.data.local.UserDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ListingViewModel_Factory implements Factory<ListingViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<UserDao> userDaoProvider;

  public ListingViewModel_Factory(Provider<UserRepository> userRepositoryProvider,
      Provider<UserDao> userDaoProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public ListingViewModel get() {
    return newInstance(userRepositoryProvider.get(), userDaoProvider.get());
  }

  public static ListingViewModel_Factory create(Provider<UserRepository> userRepositoryProvider,
      Provider<UserDao> userDaoProvider) {
    return new ListingViewModel_Factory(userRepositoryProvider, userDaoProvider);
  }

  public static ListingViewModel newInstance(UserRepository userRepository, UserDao userDao) {
    return new ListingViewModel(userRepository, userDao);
  }
}