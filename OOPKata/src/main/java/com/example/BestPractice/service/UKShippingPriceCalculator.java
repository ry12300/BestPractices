package com.example.BestPractice.service;

import com.example.BestPractice.model.Order;
import com.example.BestPractice.service.contract.ShippingPriceCalculator;

public class UKShippingPriceCalculator implements ShippingPriceCalculator {

    private static final Double UK_SMALL_ORDER_PRICE = 4.99;
    private static final Double UK_LARGE_ORDER_PRICE = 9.99;

    @Override
    public Double calculateShippingPrice(Order order) {

        if (order.getProducts().size() <= 3) {
            return UK_SMALL_ORDER_PRICE;
        } else {
            return UK_LARGE_ORDER_PRICE;
        }
    }

}
