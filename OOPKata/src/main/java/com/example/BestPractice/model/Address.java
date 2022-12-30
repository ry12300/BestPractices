package com.example.BestPractice.model;

public class Address {

    private final Integer houseNumber;
    private final String postCode;
    private final Country country;

    public Address(Integer houseNumber, String postCode, Country country) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

}
