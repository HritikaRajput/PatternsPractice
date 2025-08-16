package org.lld.questions.atm;

import org.lld.questions.atm.states.ATMState;
import org.lld.questions.atm.states.IdleState;
import org.lld.questions.atm.states.OperationType;

public class ATM {
    private static final ATM atm = new ATM();
    private ATMState currentAtmState;
    private Card card;
//    private static CashDispenser cashDispenser;
    private static BankService bankingService;

    public static ATM getInstance() {
        return atm;
    }

    public void initializeBalance(int[] initialDenoms) {
        currentAtmState = new IdleState();
//        denominationsMap.put(Denominations.HUNDREDS, initialDenoms[0]);
//        denominationsMap.put(Denominations.FIVE_HUNDREDS, initialDenoms[1]);
//        denominationsMap.put(Denominations.TWO_THOUSANDS, initialDenoms[2]);
    }

//    public Double getBalance() {
//
//    }
    public void setCardDetails(Card card) {
        this.card =card;
    }
    public Card getCard() {
        return this.card;
    }
    public BankService getBankingService() {
        return this.bankingService;
    }

    public void setState(ATMState atmState) {
        this.currentAtmState = atmState;
    }

    public synchronized void initiateLogin( Card card) {
        currentAtmState.fillCardDetails(atm, card);
    }

    public synchronized void authenticatePin(Card card, int pin) {
        currentAtmState.authenticateLogin(atm, card, pin);
    }

    public synchronized void selectOption(OperationType operationType, int... args) throws Exception {
        currentAtmState.selectOptions(atm, operationType, args);
    }

    public synchronized void withdrawMoney( double amount) throws Exception {
        /// check if atm can withdraw cash
        // check if sufficient balance in account
       this.getBankingService().withDrawMoney(card, amount);

    }

    public synchronized void depositMoney(int[] denominationsMap) throws Exception {
        double amount = 0;
        amount += (100* denominationsMap[0] + 500 * denominationsMap[1] + 2000 * denominationsMap[2]);
        this.getBankingService().depositAmount(card, amount);
    }

    public synchronized void checkBalance() {
        System.out.println("your current balance is: " + this.getBankingService().getBalance(card));
    }
}
