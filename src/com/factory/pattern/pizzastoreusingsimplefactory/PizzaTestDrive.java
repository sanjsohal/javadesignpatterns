package com.factory.pattern.pizzastoreusingsimplefactory;

public class PizzaTestDrive {
	public static void main(String...args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizza = new PizzaStore(factory);
		pizza.orderPizza("veggie");
	}
}
