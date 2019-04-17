package com.androidpopcorn.tenx.daggerandroidinjectorsdemo;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di.DaggerAppComponent;


import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class BaseApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Inject
    ApiService apiService;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
