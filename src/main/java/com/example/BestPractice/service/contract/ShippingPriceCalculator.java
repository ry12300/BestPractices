package com.example.BestPractice.service.contract;

import com.example.BestPractice.model.Order;

public interface ShippingPriceCalculator {

    Double calculateShippingPrice(Order order);
}
