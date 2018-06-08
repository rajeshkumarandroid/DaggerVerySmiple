package com.sampledagger;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rajesh Kumar on 08-06-2018.
 */
// A Component is a mapping between one or more modules and one or more classes that will use them
@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void injeect(MainActivity mainActivity);
}
