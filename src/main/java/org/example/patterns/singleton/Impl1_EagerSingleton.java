package org.example.patterns.singleton;

// all static variable or objects are preloaded
public class Impl1_EagerSingleton {
    private static Impl1_EagerSingleton obj = new Impl1_EagerSingleton();

    private Impl1_EagerSingleton(){
    }

    public static Impl1_EagerSingleton getSingleton() {
        return obj;
    }
}
