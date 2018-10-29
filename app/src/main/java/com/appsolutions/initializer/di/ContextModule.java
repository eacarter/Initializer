package com.appsolutions.initializer.di;

import android.app.Application;
import android.content.Context;

import com.appsolutions.initializer.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
class ContextModule {

    BaseApplication application;


    @Singleton
    public Context providesContext(BaseApplication application){
        this.application = application;
        return application;
    };
}
