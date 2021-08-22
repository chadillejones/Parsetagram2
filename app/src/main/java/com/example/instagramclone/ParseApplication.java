package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new  Parse.Configuration.Builder(this)
        .applicationId("RgJTxBdcfB5dwzCA5MA8Pxv6evMYWOuRwkkkFOaW")
        .clientKey("uFsGx6t7nrA1aeD0r8UajtMPdynUE1Q7IVvxOqdv")
        .server("https://parseapi.back4app.com").build());
    }
}
