package org.example.patterns.singleton;

// initialized when used
// not thread safe
public class Impl2_LazySingleton {
    private static Impl2_LazySingleton obj;

    private Impl2_LazySingleton(){
    }

    public static Impl2_LazySingleton getSingleton() {
        if(obj == null) {
            obj = new Impl2_LazySingleton();
        }
        return obj;
    }
}
