package org.example.singleton;

public class SingletonClass {
    private static final SingletonClass instance;

    static {
        instance = new SingletonClass();
    }

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if (instance == null) return new SingletonClass();
        return instance;
    }
}
