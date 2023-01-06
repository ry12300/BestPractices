package com.example.BestPractice.model.product;

public class Shoe extends BaseProduct {

    private Colour laceColour;

    public Shoe(Brand brand, Colour colour) {
        super(brand, colour, 45.99);
    }

    public void setLaceColour(Colour laceColour) {
        this.laceColour = laceColour;
    }

}
