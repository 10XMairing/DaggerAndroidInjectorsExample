package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui;


import android.content.Context;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.BaseApplication;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di.scope.PerActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {MainModule.class})
public interface MainSubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }



    }
