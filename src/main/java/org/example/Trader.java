package org.example;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city){
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getCity(){
        return this.city;
    }

}