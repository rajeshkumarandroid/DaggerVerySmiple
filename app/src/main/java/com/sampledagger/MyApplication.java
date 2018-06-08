package com.sampledagger;

import android.app.Application;

/**
 * Created by Rajesh Kumar on 08-06-2018.
 */
public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent =createMycomponet();
    }

    MyComponent getMyComponent(){
        return myComponent;
    }

    private MyComponent createMycomponet(){
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}
