package com.example.BestPractice;

import com.example.BestPractice.model.Address;
import com.example.BestPractice.model.Country;
import com.example.BestPractice.model.Customer;
import com.example.BestPractice.model.Order;
import com.example.BestPractice.model.product.Brand;
import com.example.BestPractice.model.product.Colour;
import com.example.BestPractice.model.product.Shoe;
import com.example.BestPractice.model.product.SleeveType;
import com.example.BestPractice.model.product.TShirt;
import com.example.BestPractice.service.contract.ShippingPriceCalculator;
import com.example.BestPractice.service.factory.ShippingPriceCalculatorFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestPracticeApplication.class, args);

		// Create Products
		Shoe shoe = new Shoe(Brand.ADIDAS, Colour.GREEN);
		shoe.setLaceColour(Colour.RED);
		TShirt tShirt = new TShirt(Brand.NIKE, Colour.PINK, SleeveType.LONG);

		// Create Customer
		Address customerAddress = new Address(123, "BT1ABC", Country.AU);
		Customer customer = new Customer("Ross Young", customerAddress);

		// Create Order
		Order order = new Order(customer);
		order.addProduct(shoe);
		order.addProduct(tShirt);
		order.getTotalProductsPrice();

		// Calculate Shipping
		ShippingPriceCalculator shippingPriceCalculator = ShippingPriceCalculatorFactory.createShippingCalculator(order);
		Double shippingCost = shippingPriceCalculator.calculateShippingPrice(order);
		order.setShippingPrice(shippingCost);

		Double totalOrderPrice = order.getTotalProductsPrice() + order.getShippingPrice();
		System.out.println("TOTAL PRICE OF ORDER = " + totalOrderPrice);
	}

}
