package com.example.BestPractice.service;

import com.example.BestPractice.model.Order;
import com.example.BestPractice.service.contract.ShippingPriceCalculator;

public class AUShippingPriceCalculator implements ShippingPriceCalculator {

    private static final Double AU_SMALL_ORDER_PRICE = 14.99;
    private static final Double AU_LARGE_ORDER_PRICE = 19.99;

    @Override
    public Double calculateShippingPrice(Order order) {

        if (order.getProducts().size() <= 3) {
            return AU_SMALL_ORDER_PRICE;
        } else {
            return AU_LARGE_ORDER_PRICE;
        }
    }

}
