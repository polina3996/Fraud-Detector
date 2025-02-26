package org.example;

import java.util.Objects;

public class FraudDetector {

    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getFullName(), "Pokemon")){
            return true;
        }
        return false;
    }
}
