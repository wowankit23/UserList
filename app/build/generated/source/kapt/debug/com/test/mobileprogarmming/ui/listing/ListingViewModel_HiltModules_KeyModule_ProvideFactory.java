// Generated by Dagger (https://dagger.dev).
package com.test.mobileprogarmming.ui.listing;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ListingViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ListingViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ListingViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ListingViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ListingViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
