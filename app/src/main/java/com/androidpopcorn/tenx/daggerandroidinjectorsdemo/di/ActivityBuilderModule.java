package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di;


import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.di.scope.PerActivity;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui.MainActivity;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {


    @ContributesAndroidInjector(modules = {MainModule.class})
    @PerActivity
    abstract MainActivity bindMainActivity();

}
