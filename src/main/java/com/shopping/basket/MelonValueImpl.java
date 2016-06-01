package com.shopping.basket;

public class MelonValueImpl extends FruitValue {
		
	private String name;
	
	public MelonValueImpl(Fruit fruit) {
		setPrice(fruit.price);
		discountAvailable(true);
		name = fruit.name;
	}

	public double discountPrice(double value) {
		// There is none so return value
		return value;
	}

	public int discountVolume(int count) {
		
		////Melons are 50p each, but are available as ‘buy one get one free’
		
		// Only applies if there are two or more
		if(count > 1) {
								
			int counter = count;
			
			while(counter > 1)
			{
				//Need to check if the count is a multiple of 2
				if(calculateMultiple(counter, 2)) {		
					return (count/2) + (count-counter);
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
