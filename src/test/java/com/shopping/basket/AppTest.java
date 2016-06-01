package com.shopping.basket;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApple() {
		Basket basket = new Basket(new String[] { "Apple" });

		double expected = 0.35;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testBanana() {
		Basket basket = new Basket(new String[] { "Banana" });

		double expected = 0.20;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testMelon() {
		Basket basket = new Basket(new String[] { "Melon" });

		double expected = 0.50;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testMelon2() {
		Basket basket = new Basket(new String[] { "Melon", "Melon" });

		double expected = 0.50;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testMelon3() {
		Basket basket = new Basket(new String[] { "Melon", "Melon", "Melon" });

		double expected = 1.00;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testLime() {
		Basket basket = new Basket(new String[] { "Lime" });

		double expected = 0.15;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testLime3() {
		Basket basket = new Basket(new String[] { "Lime", "Lime", "Lime" });

		double expected = 0.30;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testLime5() {
		Basket basket = new Basket(new String[] { "Lime", "Lime", "Lime", "Lime", "Lime" });

		double expected = 0.60;
		double calculated = basket.calculateValue();

		assertTrue(calculated == expected);
	}

	public void testThreeItem() {
		Basket basket = new Basket(new String[] { "Apple", "Apple", "Banana" });

		assertTrue(basket.calculateValue() == 0.90);
	}

	public void testMultipleItem() {
		Basket basket = new Basket(new String[] { "Apple", "Apple", "Banana", "Lime", "Lime", "Lime", "Lime", "Lime",
				"Melon", "Melon", "Melon" });

		assertTrue(basket.calculateValue() == 2.50);
	}

	public void testEmpty() {
		Basket basket = new Basket(new String[] {});

		assertTrue(basket.calculateValue() == 0.00);
	}
}
