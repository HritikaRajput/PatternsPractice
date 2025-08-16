package org.example.patterns.chainofresponsibility;

public interface RequestHandler {
    void setNext(RequestHandler handler);
    void handle(Request request) throws Exception;
}
