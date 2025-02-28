package org.example;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getFraud(){
        return this.fraud;
    }
    public String getRuleName(){
        return this.ruleName;
    }
}