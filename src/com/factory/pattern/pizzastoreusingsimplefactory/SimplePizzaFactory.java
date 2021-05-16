package com.factory.pattern.pizzastoreusingsimplefactory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if(type.contentEquals("cheese")) {
			pizza = new CheesePizza(); 
		} else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}		
		return pizza;
	}
}
