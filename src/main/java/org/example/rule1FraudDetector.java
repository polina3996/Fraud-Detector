package org.example;

import java.util.Objects;

public class rule1FraudDetector implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        if (Objects.equals(transaction.getTrader().getFullName(), "Pokemon")) {
            return true;
        }
        return false;
    }
}
