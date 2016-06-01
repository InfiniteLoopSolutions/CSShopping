package com.shopping.basket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Hashtable;

public class Basket {
	
	private static final String LIME = "Lime";
	private static final String MELON = "Melon";
	private static final String BANANA = "Banana";
	private static final String APPLE = "Apple";
	
	private ProductLists productList;
	private Hashtable<String, Fruit> products;
			
	public Basket(String[] shoppingList)
	{		
		productList = new ProductLists(shoppingList);
		createProducts();
	}
	
	public double calculateValue() {
		
		double runningTotal = 0;
		
		for(String fruitName : productList.getProducts().keySet()){	
							
			FruitValue val = getFruitImpl(fruitName, products.get(fruitName));	
			
			if(val != null){
				val.setCount(productList.getProducts().get(fruitName));
				runningTotal += val.calculateValue();
			}
		}
		
		return new BigDecimal(runningTotal).setScale(2, RoundingMode.HALF_UP).doubleValue();		
	}
	
	private FruitValue getFruitImpl(String fruitName, Fruit fruit)
	{
		switch(fruitName){
		case APPLE :
			return new AppleValueImpl(fruit);
		case BANANA :
			return new BannanaValueImpl(fruit);
		case MELON :
			return new MelonValueImpl(fruit);
		case LIME :
			return new LimeValueImpl(fruit);
			default:
		}
		return null;
	}

	private void createProducts() {
		products = new Hashtable<String, Fruit>();
		
		for (String fruit : productList.getProducts().keySet()) {
			
			switch(fruit)	{
			
			case APPLE:				
				products.put(APPLE, new Fruit.Builder(fruit, 0.35).type(fruit).build());				
			case BANANA :
				products.put(BANANA, new Fruit.Builder(fruit, 0.20).type(fruit).build());				
			case MELON :
				products.put(MELON, new Fruit.Builder(fruit, 0.50).type(fruit).build());				
			case LIME :
				products.put(LIME, new Fruit.Builder(fruit, 0.15).type(fruit).build());				
				default:	
	
			}			
		}
	}
}
