//package org.lld.questions.atm2.entity;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Account {
//    private static Double balance;
//    private static Long id;
//    private static AccountType accountType;
//
//    private final Map<String, Card> cardMap = new ConcurrentHashMap<>();
//
//    Account(Double balance, Long id, AccountType accountType) {
//        this.balance = balance;
//        this.id = id;
//        this.accountType = accountType;
//    }
//
//    public synchronized double getBalance() {
//        return this.balance;
//    }
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public void linkCardToAccount(Card card) {
//        this.cardMap.put(card.getCardNo(), card);
//    }
//
//    public synchronized void updateBalance(Double amount, UpdateType update) throws Exception {
//        switch (update) {
//            case ADD:
//                this.balance += amount;
//                break;
//            case SUBTRACT:
//                this.balance -= amount;
//                break;
//            default:
//                throw new Exception("Invalid Update");
//        }
//    }
//}
