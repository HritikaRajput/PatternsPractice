package org.lld.questions.atm;

public class Client {
    public  static void run() {
        ATM atm = ATM.getInstance();
        atm.initializeBalance(new int[] {2,2,2});




    }
    public static void main(String[] args) {
        run();
    }
}
