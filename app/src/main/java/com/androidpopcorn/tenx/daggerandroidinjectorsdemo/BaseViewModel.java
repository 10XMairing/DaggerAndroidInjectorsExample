package com.androidpopcorn.tenx.daggerandroidinjectorsdemo;

import android.arch.lifecycle.ViewModel;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;

public class BaseViewModel extends ViewModel {

    private final ApiService apiService;

    public BaseViewModel(ApiService apiService) {
        this.apiService = apiService;
    }


    @Override
    protected void onCleared() {
        super.onCleared();


//        detatch your network callbacks here
    }
}
