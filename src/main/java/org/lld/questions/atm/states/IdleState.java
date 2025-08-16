package org.lld.questions.atm.states;

import org.lld.questions.atm.ATM;
import org.lld.questions.atm.Card;

public class IdleState implements ATMState {
    @Override
    public void fillCardDetails(ATM atm, Card card) {
        System.out.println("Insert your card details");
        atm.setState(new HasCardState());
    }

    @Override
    public void authenticateLogin(ATM atm, Card card, int pin) {
    }

    @Override
    public double getBalance(ATM atm,Card card) {
        return 0;
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
