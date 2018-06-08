package com.sampledagger;

import java.util.Date;

/**
 * Created by Rajesh Kumar on 08-06-2018.
 */
public class MyExampleImpl implements MyExample {

    long date;

    public MyExampleImpl(){
        this.date =  new Date().getTime();
    }

    @Override
    public long getDate() {
        return date;
    }
}
