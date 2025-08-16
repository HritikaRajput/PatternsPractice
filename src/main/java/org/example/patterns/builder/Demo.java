package org.example.patterns.builder;

public class Demo {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Director dir = new Director(new AccountsEmployeeBuilder());
        Employee em = dir.run();
        System.out.println(em.toString());

    }
}
