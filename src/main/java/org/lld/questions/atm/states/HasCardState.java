package org.lld.questions.atm.states;

import org.lld.questions.atm.ATM;
import org.lld.questions.atm.Card;

public class HasCardState implements ATMState{
    @Override
    public void fillCardDetails(ATM atm, Card card) {
        System.out.println("Card was already inserted");
    }

    @Override
    public void authenticateLogin(ATM atm, Card card, int pin) {
        atm.getBankingService().checkPin(card, pin);
        atm.setState(new SelectOptionState());
    }

    @Override
    public double getBalance(ATM atm,Card card) {
        return 0D;
    }

    @Override
    public void selectOptions(ATM atm, OperationType type, int... args) {
        return ;
    }

    @Override
    public void depositMoney(ATM atm, Card card, int[] denominations) {

    }

    @Override
    public void withDrawMoney(ATM atm, Card card, double amount) {

    }

    @Override
    public void ejectCard(ATM atm) {

    }
}
