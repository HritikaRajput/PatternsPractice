package org.lld.questions.atm2.entity;

public class Casette {
    private static int id;
    private static CurrencyType currencyType;
    private static int[] denominations;

    Casette(int id, CurrencyType currencyType, int[] denominations) {
        this.id = id;
        this.currencyType = currencyType;
        this.denominations = denominations;
    }

    public int getId() {
        return this.id;
    }

    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public int[] getDenominations() {
        return this.denominations;
    }

    public void setDenominations(int[] denominations) {
        this.denominations = denominations;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public void setId(int id) {
        this.id = id;
    }
}
