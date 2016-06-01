package com.shopping.basket;

public class AppleValueImpl extends FruitValue {

	private String name;
	
	public AppleValueImpl(Fruit fruit) {
		setPrice(fruit.price);
		discountAvailable(false);
		name = fruit.name;
	}
	
	public double discountPrice(double value) {
		// There is none so return value
		return value;
	}

	public int discountVolume(int count) {	
		// There is none so return value
		return count;
	}	
	
	public String getName(){
		return name;
	}
}
