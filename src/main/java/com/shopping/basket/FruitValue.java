package com.shopping.basket;

public class FruitValue extends ProductHelper implements Discount {
		
	private double price;
	private double discountPrice;
	private boolean discountAvailable;
	private int count;
			
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double discountPrice(double value) {
		return discountPrice;
	}

	@Override
	public int discountVolume(int value) {		
		return 0;
	}

	@Override
	public boolean discountAvailable() {		
		return discountAvailable;
	}
	
	@Override
	public void discountAvailable(boolean discountAvailable) {		
		this.discountAvailable = discountAvailable;
	}

	@Override
	public double calculateValue() {		
		return price * discountVolume(count);
	}
}
