package com.company;

public class VipCustomer {

    private String name ;
    private double creditLimit;
    private String emailAddress;

    //No Parameters but 3 default values
    public VipCustomer() {
        this("Default name" , 500000.00, "default@Email.com");
    }

    //2 Parameters but 1 default values
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@Email.com");
    }

    //No default values but 3 Parameters
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //The 3 below are all getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
