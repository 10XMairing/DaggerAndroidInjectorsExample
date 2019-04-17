package com.androidpopcorn.tenx.daggerandroidinjectorsdemo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;

public class ViewModelFactory<V> implements ViewModelProvider.Factory {

    private V viewModel;
    private final ApiService apiService;

    public ViewModelFactory(V viewModel, ApiService apiService) {
        this.viewModel = viewModel;
        this.apiService = apiService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(viewModel.getClass())) {
            return (T) viewModel;
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}