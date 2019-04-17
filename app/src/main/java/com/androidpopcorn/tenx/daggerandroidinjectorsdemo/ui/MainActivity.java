package com.androidpopcorn.tenx.daggerandroidinjectorsdemo.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.R;
import com.androidpopcorn.tenx.daggerandroidinjectorsdemo.data.ApiService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {


    @Inject
    ProgressDialog progressDialog;

    @Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_main);



        progressDialog.show();

    }
}
