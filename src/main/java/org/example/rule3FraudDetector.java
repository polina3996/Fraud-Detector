package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class rule3FraudDetector implements FraudRule{
    private ArrayList<String> cityList = new ArrayList<>(Arrays.asList("Sydney", "Milan"));

    @Override
    public boolean isFraud(Transaction transaction) {
        for (String city: cityList){
            if (Objects.equals(transaction.getTrader().getCity(), city)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getRuleName(){
        return "rule3";
    }

}
