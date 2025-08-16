package org.example.patterns.chainofresponsibility;

public class Request {
    public String user;
    public String userRole;
    public  int requestCount;
    public String payload;

    Request(String user, String userRole, int requestCount, String payload) {
        this.payload = payload;
        this.requestCount = requestCount;
        this.user = user;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        System.out.println(this.payload +  " " + this.requestCount + " "+ this.user + " " +this.userRole);
        return null;
    }
}
