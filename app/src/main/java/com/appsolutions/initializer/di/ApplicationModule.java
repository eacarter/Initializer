package com.appsolutions.initializer.di;


import com.appsolutions.initializer.repo.RepoService;

import javax.inject.Singleton;

import androidx.lifecycle.ViewModel;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//@Singleton
@Module
class ApplicationModule {

    private static final String BASE_URL = "http://www.omdbapi.com/";

    @Singleton
    @Provides
    static Retrofit provideRetrofit(){
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static RepoService provideRetrofitServices(Retrofit retrofit){
        return retrofit.create(RepoService.class);
    }
}
