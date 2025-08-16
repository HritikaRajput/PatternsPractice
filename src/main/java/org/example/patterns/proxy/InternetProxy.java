package org.example.patterns.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet{
    private static List<String> permittedUsers = Arrays.asList("Hritika", "John", "Alice");
    private static String currentUser;
    private static RealInternet realInternet;

    public InternetProxy(String user) {
        if (user == null || user.isEmpty()) {
            throw new IllegalArgumentException("User cannot be null or empty");
        }
        currentUser = user;
    }
    @Override
    public synchronized void connectTo(String serverHost) {
        if(!permittedUsers.contains(currentUser)) {
            throw new RuntimeException("Access denied for user: " + currentUser);
        }
        if (serverHost == null || serverHost.isEmpty()) {
            throw new IllegalArgumentException("Server host cannot be null or empty");
        }
        if(realInternet == null) {
            realInternet = new RealInternet();
        }
        realInternet.connectTo(serverHost);
    }
}
