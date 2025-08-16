package org.example.patterns.proxy;

public class Demo {
    public static void main(String[] args) {
        Internet internet = new InternetProxy("Hritika");
        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
            internet.connectTo("twitter.com");
            internet.connectTo("restricted.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        internet = new InternetProxy("Admin");
        // Admin user can access all sites
        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
            internet.connectTo("twitter.com");
            internet.connectTo("restricted.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
