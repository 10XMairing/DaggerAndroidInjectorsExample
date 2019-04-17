package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di;


import android.app.Application;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.BaseApplication;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {

    void inject(BaseApplication application);


    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder application(Application application);



    }



}
