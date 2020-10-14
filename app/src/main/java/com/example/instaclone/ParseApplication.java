package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    //initialize parse sdk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4F8yOFfqIu8JDCeNLYi5MUWqEBghdgdzGa7E0Ptu")
                .clientKey("rwQfzqIDM0R6QNxWuOz4HyDcttdkiCOUvRBEvtk9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
