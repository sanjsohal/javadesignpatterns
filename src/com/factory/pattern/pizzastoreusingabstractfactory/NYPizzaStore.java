package com.factory.pattern.pizzastoreusingabstractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		} 
		return pizza;
	}

}
