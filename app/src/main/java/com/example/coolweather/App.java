package com.example.coolweather;

import android.app.Application;

import com.facebook.stetho.Stetho;

import org.litepal.LitePal;

/**
 * Created by jb on 2017/2/23.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        Stetho.initializeWithDefaults(this);
    }
}
