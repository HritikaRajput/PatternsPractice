package org.lld.questions.atm;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static Map<String, Card> cards = new HashMap();
    private static Account account;
    String name;
    String email; // check

    User(String name, String email) {
        this.name= name;
        this.email = email;
    }



}
