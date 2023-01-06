package com.example.BestPractice.model;

import com.example.BestPractice.model.product.BaseProduct;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<BaseProduct> products = new ArrayList<>();
    private final Customer customer;
    private Double shippingPrice;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public List<BaseProduct> getProducts() {
        return products;
    }

    public void addProduct(BaseProduct product){
        this.products.add(product);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public Double getTotalProductsPrice() {

        Double totalPrice = 0.0;

        for (BaseProduct product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}
