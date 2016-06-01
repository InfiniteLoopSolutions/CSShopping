package com.shopping.basket;

import java.util.Hashtable;

public class ProductLists {
	
	private Hashtable<String, Integer> products;

	public Hashtable<String, Integer> getProducts() {
		return products;
	}

	public void setProducts(Hashtable<String, Integer> products) {
		this.products = products;
	}
	
	public ProductLists(String[] fruitList) {
				
		products = new Hashtable<String, Integer>();
				
		for (String fruit : fruitList) {			
			if(products.containsKey(fruit))
				products.replace(fruit, products.get(fruit)+1);
			else					
				products.put(fruit, 1);				
		}
	}
}
