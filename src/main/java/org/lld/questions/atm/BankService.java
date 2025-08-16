package org.lld.questions.atm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankService {
    private  final  Map<String, Card> cards = new ConcurrentHashMap<>();
    private  final Map<Long, Account> accountMap = new ConcurrentHashMap<>();
    private  final Map<String, Long> cardAccountsMap = new ConcurrentHashMap<>();

    public void addCard(Card card) {
        this.cards.put(card.getCardNo(), card);
    }
    public void addAccount(Account account) {
        this.accountMap.put(account.getId(), account);
    }
    public void addCardToAccount(Card card, Account account) {
        this.cardAccountsMap.put(card.getCardNo(), account.getId());
        Account account1 = accountMap.get(account.getId());
        account1.linkCardToAccount(card);
    }

    public boolean checkPin(Card card, int pin) {
        return this.cards.get(card.getCardNo()).getCardPin() == pin;
    }

    public Double getBalance(Card card) {
        Long accountNo = cardAccountsMap.get(card.getCardNo());
        return accountMap.get(accountNo).getBalance();
    }

    public void depositAmount(Card card, double amount) throws Exception {
        Account account = accountMap.get(cardAccountsMap.get(card.getCardNo()));
        account.updateBalance(amount, UpdateType.ADD);
    }

    public void withDrawMoney(Card card, double am) throws Exception {
        Account account = accountMap.get(cardAccountsMap.get(card.getCardNo()));
        if(account.getBalance() < am) {
            System.out.println("not enough balance");
        } else {
            account.updateBalance(am, UpdateType.SUBTRACT);
        }
    }
}

