package org.lld.questions.atm2.dto;

public class AuthRequest {
    private String cardNo;
    private Long cardPin;

    AuthRequest(String cardNo, Long cardPin) {
        this.cardNo = cardNo;
        this.cardPin = cardPin;
    }
}