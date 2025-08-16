package org.example.patterns.chainofresponsibility;

public class BusinessLogic extends BaseHandler{
    @Override
    public void handle(Request request) throws Exception {
        System.out.println("final end of responsibility");
        System.out.println(request.toString());
    }
}
