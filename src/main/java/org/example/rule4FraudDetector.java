package org.example;

import java.util.Objects;

public class rule4FraudDetector implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getCountry(), "Jamaica")) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName(){
        return "rule4";
    }
}
