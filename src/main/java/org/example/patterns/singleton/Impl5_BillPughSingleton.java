package org.example.patterns.singleton;

/* double check locking is still slow;
to avoid this, we can create an eager initialized object inside a static nested class of the object
nested classes are loaded during invocation, not during initialization
so that solvess our use case
 */
public class Impl5_BillPughSingleton {


    private Impl5_BillPughSingleton(){

    }

    // private so this nested class cant be accessed from outside
    private static class BillPugh {
        private static final Impl5_BillPughSingleton INSTANCE_OBJECT = new Impl5_BillPughSingleton();
    }

    public static Impl5_BillPughSingleton getInstance() {
        return BillPugh.INSTANCE_OBJECT;
    }
}
