package org.example;

public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getAmount(){
        return this.amount;
    }

}
