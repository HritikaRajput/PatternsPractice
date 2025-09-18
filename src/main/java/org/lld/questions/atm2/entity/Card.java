package org.lld.questions.atm2.entity;

public class Card {
    private final String cardNo;
    private final Long cardPin;

    Card(String cardNo, Long cardPin) {
        this.cardNo = cardNo;
        this.cardPin = cardPin;
    }
    
    public Long getCardPin() {
        return this.cardPin;
    }

    public String getCardNo() {
        return this.cardNo;
    }

}
