package com.shopping.basket;

public class LimeValueImpl extends FruitValue {

	private String name;
	
	public LimeValueImpl(Fruit fruit) {
		setPrice(fruit.price);
		discountAvailable(true);
		name = fruit.name;
	}

	public double discountPrice(double value) {
		// There is none so return value
		return value;
	}

	public int discountVolume(int count) {
		
		//Limes are 15p each, but are available in a ‘three for the price two’ offer
		
		// Only applies if there are three or more
		if(count > 2) {
			
			int counter = count;
			
			while(counter > 2)
			{
				//Need to check if the count is a multiple of 3
				if(calculateMultiple(counter, 3)) {		
					return (counter*2)/3 + (count-counter);
					}
				counter--;		
			}							
		}				
		return count;
	}
	
	public String getName(){
		return name;
	}
	
}
