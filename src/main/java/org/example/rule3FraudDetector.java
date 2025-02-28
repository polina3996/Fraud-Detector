package org.example;

import java.util.Objects;

public class rule3FraudDetector implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getCity(), "Synney")) {
            return true;
        }
        return false;
    }

}
