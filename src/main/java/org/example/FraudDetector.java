package org.example;

public class FraudDetector {
    rule1FraudDetector rule1 = new rule1FraudDetector();
    rule2FraudDetector rule2 = new rule2FraudDetector();
    rule3FraudDetector rule3 = new rule3FraudDetector();
    rule4FraudDetector rule4 = new rule4FraudDetector();
    rule5FraudDetector rule5 = new rule5FraudDetector();

    boolean isFraud(Transaction t){
        return (rule1.isFraud(t)|| rule2.isFraud(t)|| rule3.isFraud(t)|| rule4.isFraud(t)|| rule5.isFraud(t));
    }
}
