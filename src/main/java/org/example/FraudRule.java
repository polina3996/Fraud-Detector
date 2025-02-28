package org.example;

interface FraudRule {

    boolean isFraud(Transaction t);
    String getRuleName();
}