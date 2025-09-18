package org.lld.questions.atm2.entity;

import java.sql.Date;

public class Transaction {
    private static int id;
    private static double amount;
    private static TransactionType transactionType;
    private static TransactionStatus transactionStatus;
    private static Long idempotencyKey;
    private static Date startedAt;
    private static Date lastUpdatedAt;

    Transaction(int id, double amount, TransactionType transactionType, Date transactionDate, Long idempotencyKey) {
        this.id = id;
        this.amount = amount;
        this.transactionType = transactionType;
        this.startedAt = startedAt;
        this.lastUpdatedAt = lastUpdatedAt;
        this.idempotencyKey = idempotencyKey;
    }
}
