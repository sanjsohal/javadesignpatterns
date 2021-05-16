package com.factory.pattern.pizzastoreusingabstractfactory;

public class PizzaTestDrive {
	public static void main(String...args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Evan ordered "+pizza.getName()+"\n");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Adam ordered "+pizza.getName()+"\n");		
	}
}
