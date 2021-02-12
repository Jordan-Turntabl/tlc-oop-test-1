package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product implements MontrealTradedProducts{
	private String productID;
	private double currentValue;
	
	public Product(final String productID, final double currentValue){
		this.productID = productID;
		this.currentValue = currentValue;
	}
	
	public String getProductID() {
		return productID;
	}
	
	public void setProductID(final String productID) {
		this.productID = productID;
	}
	
	public double getCurrentValue() {
		return currentValue;
	}
	
	public void setCurrentValue(final double currentValue) {
		this.currentValue = currentValue;
	}
	
	public void getValueOfProduct(final Product product){
	
	}
	
	@Override
	public void addNewProduct(final Product product) throws ProductAlreadyRegisteredException {
		final List<Product> item = new ArrayList<>();
	}
	
	@Override
	public void trade(final Product product, final int quantity) {
	
	}
	
	@Override
	public int totalTradeQuantityForDay() {
		return 0;
	}
	
	@Override
	public double totalValueOfDaysTradedProducts() {
		return 0;
	}
}
