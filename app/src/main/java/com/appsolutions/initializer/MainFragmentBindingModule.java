package com.appsolutions.initializer;

import com.appsolutions.initializer.fragment.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBindingModule {

//    @ContributesAndroidInjector
//    abstract ListFragment provideListFragment();
//
//    @ContributesAndroidInjector
//    abstract DetailsFragment provideDetailsFragment();

    @ContributesAndroidInjector
    abstract HomeFragment provideHomeFragment();


}
