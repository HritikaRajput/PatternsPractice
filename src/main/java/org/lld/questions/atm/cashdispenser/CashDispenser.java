package org.lld.questions.atm.cashdispenser;

public interface CashDispenser {
    boolean canDispenseCash(double amount);
    void dispenseCash();
}
