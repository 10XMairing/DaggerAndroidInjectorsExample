package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui;


import android.app.ProgressDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ViewModelFactory;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di.scope.ActivityContext;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di.scope.PerActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    @ActivityContext
    @PerActivity
    Context provideMainActivity(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    @PerActivity
    ProgressDialog provideDialog(@ActivityContext Context context){
        return new ProgressDialog(context);
    }


    @Provides
    @PerActivity
    MainViewModel provideViewModel(MainActivity mainActivity, ApiService apiService){
        ViewModelFactory<MainViewModel> factory = new ViewModelFactory<>(new MainViewModel(apiService), apiService);
        return ViewModelProviders.of(mainActivity, factory).get(MainViewModel.class);
    }




}
