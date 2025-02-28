package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FraudDetector {
    rule1FraudDetector rule1 = new rule1FraudDetector();
    rule2FraudDetector rule2 = new rule2FraudDetector();
    rule3FraudDetector rule3 = new rule3FraudDetector();
    rule4FraudDetector rule4 = new rule4FraudDetector();
    rule5FraudDetector rule5 = new rule5FraudDetector();
    ArrayList<FraudRule> ruleList = new ArrayList<>(Arrays.asList(rule1, rule2, rule3, rule4, rule5));

    FraudDetectionResult isFraud(Transaction t){
        for (FraudRule rule: ruleList){
            FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(rule.isFraud(t), rule.getRuleName());
            if(fraudDetectionResult.getFraud()) {
                return fraudDetectionResult;
            }
        }
        return new FraudDetectionResult(false, null);
        }
}
