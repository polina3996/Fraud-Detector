package org.example;

import java.util.Objects;

public class rule5FraudDetector implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getCountry(), "Germany") && transaction.getAmount() > 1000) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName(){
        return "rule5";
    }
}
