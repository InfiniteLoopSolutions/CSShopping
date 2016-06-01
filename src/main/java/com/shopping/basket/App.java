package com.shopping.basket;

/**
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
//    	Write a simple Java program that calculates the price of a basket of shopping. Items are presented one at a time, in a list, identified by name - for example "Apple" or "Banana". Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a basket with two apples and one banana.
//
//    	Items are priced as follows:
//    	 - Apples are 35p each
//    	 - Bananas are 20p each
//    	 - Melons are 50p each, but are available as ‘buy one get one free’
//    	 - Limes are 15p each, but are available in a ‘three for the price two’ offer
//
//    	Given a list of shopping, calculate the total cost of those items.

        String[] fruitList = new String[4];
        
        fruitList[0] = "Apples";
        fruitList[1] = "Bananas";
        fruitList[2] = "Melons";
        fruitList[3] = "Limes";
       
               
        Basket basket = new Basket(fruitList);
        
        basket.calculateValue();
        
    }
}
