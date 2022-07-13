package com.app.java.core;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized(Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    protected Object readResolve(){
        return singleton;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
