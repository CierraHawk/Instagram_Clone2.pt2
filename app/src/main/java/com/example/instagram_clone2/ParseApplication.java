package com.example.instagram_clone2;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iAUZpTp7cNBZnKGFJ06jSUcmQEkMMjGrbTe8DGxN")
                .clientKey("DdfOauuIgdaYFWZaNbGND4BqFcO8VaNx9gAf1da7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

