package org.example.patterns.singleton;

public class Impl3_SynchronizedSingleton {
    private static Impl3_SynchronizedSingleton obj;

    private Impl3_SynchronizedSingleton(){
    }

    // takes a lock on the method on function call,
    // cons - makes functionality slow
    synchronized public static Impl3_SynchronizedSingleton getSingleton() {
        if(obj == null) {
            obj = new Impl3_SynchronizedSingleton();
        }
        return obj;
    }
}
