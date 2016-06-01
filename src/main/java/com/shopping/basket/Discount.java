package com.shopping.basket;

public interface Discount {

	double discountPrice(double value);
	
	int discountVolume(int value);
	
	boolean discountAvailable();

	void discountAvailable(boolean discountAvailable);

	public double calculateValue();
}
