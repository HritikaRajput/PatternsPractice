package org.lld.questions.atm.states;

import org.lld.questions.atm.ATM;
import org.lld.questions.atm.Card;

public class SelectOptionState implements ATMState{
    @Override
    public void fillCardDetails(ATM atm, Card card) {
        System.out.println("alread done");
    }

    @Override
    public void authenticateLogin(ATM atm, Card card, int pin) {
        System.out.printf("laready done");
    }

    @Override
    public double getBalance(ATM atm, Card card) {
        return 0;
    }

    @Override
    public void selectOptions(ATM atm, OperationType type, int... args) throws Exception {
        switch (type) {
            case DEPOSIT:
                int[] denominationsMap = new int[]{args[0]};
                atm.depositMoney(denominationsMap);
            case WITHDRAW:
                double amount = args[0];
                atm.withdrawMoney(amount);
            case CHECK_BAL:
                atm.checkBalance();
        }
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
