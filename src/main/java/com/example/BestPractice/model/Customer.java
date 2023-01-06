package com.example.BestPractice.model;

public class Customer {

    private final String fullName;
    private final Address address;

    public Customer(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}
