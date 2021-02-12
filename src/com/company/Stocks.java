package com.company;

public class Stocks implements ProductPricingService {
	@Override
	public double price(final String exchange, final String ticker) {
		return 0;
	}
	
	@Override
	public double price(final String exchange, final String contractCode, final int month, final int year) {
		return 0;
	}
}
