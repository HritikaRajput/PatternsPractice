package org.example.patterns.singleton;

public class Impl4_DoubleCheckLockSynchronizedSingleton {
    private static volatile Impl4_DoubleCheckLockSynchronizedSingleton singleton;

    private Impl4_DoubleCheckLockSynchronizedSingleton(){
    }

    //Object creation happens in the L1 cache and then objects are fluhsed into memory at regular intervals
    // there can be a case where object creation happened in the cache for thread1, and it was not flushed to memory
    // so when second thread comes, it does not see the created object and takes a lock
    // to avoid the above issue, we use volatile keyword, when you use volatile it flushes object to the memory
    // volatile prevents reordering of object creation, and makes sure we are seeing the fully created object from one thread

    public static Impl4_DoubleCheckLockSynchronizedSingleton getInstance() {
        if(singleton == null) {
            synchronized (Impl4_DoubleCheckLockSynchronizedSingleton.class) {
                singleton = new Impl4_DoubleCheckLockSynchronizedSingleton();
            }
        }
        return singleton;
    }
}

