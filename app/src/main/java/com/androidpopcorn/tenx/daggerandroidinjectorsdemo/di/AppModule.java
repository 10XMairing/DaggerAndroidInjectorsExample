package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di;


import android.app.Activity;
import android.app.Application;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Module
public abstract class AppModule {


    @Provides
    @Singleton
    static Application provideApplication(Application application){
        return application;
    }



    @Provides
    @Singleton
    static ApiService provideApiService(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com").client(new OkHttpClient()).build();


        return retrofit.create(ApiService.class);
    }
}
