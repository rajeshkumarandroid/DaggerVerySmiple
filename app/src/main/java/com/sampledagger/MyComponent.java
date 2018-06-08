package com.sampledagger;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rajesh Kumar on 08-06-2018.
 */
@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void injeect(MainActivity mainActivity);
}
