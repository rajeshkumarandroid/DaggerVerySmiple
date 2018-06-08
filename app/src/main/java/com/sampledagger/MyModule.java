package com.sampledagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rajesh Kumar on 08-06-2018.
 */

//A Module defines one or more injectable classes
@Module
public class MyModule {


    @Provides
    @Singleton
    static MyExample provideMyExample(){
        return new MyExampleImpl();
    }
}
