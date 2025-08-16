package org.example.patterns.chainofresponsibility;

public class Demo {
    public static void main(String[] args) throws Exception {
        run();
    }
    public static void  run() throws Exception {
        RequestHandler auth  = new AuthHandler();
        RequestHandler rateLimiter = new RateHandler();
        RequestHandler businessLogic = new BusinessLogic();

        // Setting Chain
        auth.setNext(rateLimiter);
        rateLimiter.setNext(businessLogic);

        // Validation
        Request request = new Request("Hr", "admin", 12, "asdf");
        auth.handle(request);
        
        Request request2 = new Request("Hr", "admin", 120, "asdf");
        auth.handle(request2);
    }
}
