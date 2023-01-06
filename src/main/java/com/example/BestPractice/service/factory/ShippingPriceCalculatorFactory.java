package com.example.BestPractice.service.factory;

import com.example.BestPractice.model.Country;
import com.example.BestPractice.model.Order;
import com.example.BestPractice.service.AUShippingPriceCalculator;
import com.example.BestPractice.service.UKShippingPriceCalculator;
import com.example.BestPractice.service.contract.ShippingPriceCalculator;

public class ShippingPriceCalculatorFactory {

    public static ShippingPriceCalculator createShippingCalculator(Order order) {

        Country countryOfOrigin = order.getCustomer().getAddress().getCountry();

        if (Country.AU.equals(countryOfOrigin)) {
            return new AUShippingPriceCalculator();
        } else {
            return new UKShippingPriceCalculator();
        }
    }
}
