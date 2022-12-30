package com.example.BestPractice.model.product;

public class TShirt extends BaseProduct {

    private final SleeveType sleeveType;

    public TShirt(Brand brand, Colour colour, SleeveType sleeveType) {
        super(brand, colour, 18.99);
        this.sleeveType = sleeveType;
    }

}
