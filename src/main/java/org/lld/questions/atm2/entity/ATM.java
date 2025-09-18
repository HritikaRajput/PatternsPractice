package org.lld.questions.atm2.entity;

public class ATM {
    private static int id;
    private static String location;
    private static final ATM atm = new ATM();

    private ATM() {
        this.id = 100;
        this.location = "New York";
    }

    public static ATM getInstance() {
        return atm;
    }
    
}
