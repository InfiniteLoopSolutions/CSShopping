package com.shopping.basket;

public abstract class ProductHelper {

	public ProductHelper() {
		super();
	}

	protected boolean calculateMultiple(int valueToCheck, int divisor) {		
		// Check we are in a valid position
		if(valueToCheck % divisor == 0) {
			return true;			
		}		
		return false;
	}
	
	protected abstract double calculateValue();	

}