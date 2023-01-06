package com.example.BestPractice.model.product;

public abstract class BaseProduct {

    private final Brand brand;
    private final Colour colour;
    private final Double price;

    public BaseProduct(Brand brand, Colour colour, Double price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

}
