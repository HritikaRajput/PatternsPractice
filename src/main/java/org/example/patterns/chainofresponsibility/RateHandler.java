package org.example.patterns.chainofresponsibility;

public class RateHandler extends BaseHandler{
    @Override
    public void handle(Request request) throws Exception {
        if(request.requestCount >= 100) {
            throw new Exception("New RateLimit Error");
        }
        forward(request);
    }
}
