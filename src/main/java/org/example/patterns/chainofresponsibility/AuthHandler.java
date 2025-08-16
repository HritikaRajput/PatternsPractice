package org.example.patterns.chainofresponsibility;

public class AuthHandler extends BaseHandler{

    @Override
    public void handle(Request request) throws Exception {
        if(request.userRole == null) {
            throw new Exception("New Auth Error");
        }
        forward(request);
    }
}
