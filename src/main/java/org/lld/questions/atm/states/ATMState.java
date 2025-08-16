package org.lld.questions.atm.states;

import org.lld.questions.atm.ATM;
import org.lld.questions.atm.Card;

/*
   IDLE,
    HAS_CARD,
    SELECT,
    WITHDRAW,
    DEPOSIT,
    CHECK_BALANCE;
 */
public interface ATMState {
    public void fillCardDetails(ATM atm, Card card);
    public void authenticateLogin(ATM atm, Card card, int pin);
    public double getBalance(ATM atm,Card card);
    public void selectOptions(ATM atm,OperationType type, int... args) throws Exception;
    public void depositMoney(ATM atm, Card card, int[] denominations);
    public void withDrawMoney(ATM atm, Card card, double amount);
    public void ejectCard(ATM atm);
}
