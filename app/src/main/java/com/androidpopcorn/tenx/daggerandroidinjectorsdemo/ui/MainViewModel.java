package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui;

import android.util.Log;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.BaseViewModel;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;

public class MainViewModel extends BaseViewModel {


    public MainViewModel(ApiService apiService) {
        super(apiService);

        if(apiService == null){
            Log.d("TEST", "MainViewModel: api service was not injected properly");
        }else {
            Log.d("TEST", "MainViewModel: SUCCESS");
        }

    }
}
