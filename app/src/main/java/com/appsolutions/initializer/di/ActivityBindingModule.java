package com.appsolutions.initializer.di;

import com.appsolutions.initializer.MainActivity;
import com.appsolutions.initializer.MainFragmentBindingModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules =
            {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
