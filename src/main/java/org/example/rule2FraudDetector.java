package org.example;

public class rule2FraudDetector implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}
