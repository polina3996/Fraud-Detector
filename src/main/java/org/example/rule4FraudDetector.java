package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class rule4FraudDetector implements FraudRule{
    private ArrayList<String> countryList = new ArrayList<>(Arrays.asList("Jamaica", "Australia"));
    @Override
    public boolean isFraud(Transaction transaction) {
        for (String country: countryList){
            if (Objects.equals(transaction.getTrader().getCountry(), country)) {
            return true;
            }
        }
        return false;
    }

    @Override
    public String getRuleName(){
        return "rule4";
    }
}
