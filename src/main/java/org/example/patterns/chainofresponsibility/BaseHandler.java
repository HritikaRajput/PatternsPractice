package org.example.patterns.chainofresponsibility;

public abstract class BaseHandler implements RequestHandler {
    protected RequestHandler next;

    @Override
    public void setNext(RequestHandler handler) {
        this.next = handler;
    }

    public void forward(Request request) throws Exception {
        if(next != null) {
            next.handle(request);
        }
    }
}
