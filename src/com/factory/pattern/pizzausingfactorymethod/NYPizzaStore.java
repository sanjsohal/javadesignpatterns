package com.factory.pattern.pizzausingfactorymethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else
		return null;
	}

}
