package org.example;

import java.util.Objects;

public class FraudDetector {

    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getFullName(), "Pokemon")){
            return true;
        } else if (transaction.getAmount()>1000000) {
            return true;
        } else if (Objects.equals(transaction.getTrader().getCity(), "Synney")){
            return true;
        }
        return false;
    }
}
