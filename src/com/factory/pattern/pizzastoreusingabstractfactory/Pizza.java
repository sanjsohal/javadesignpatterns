package com.factory.pattern.pizzastoreusingabstractfactory;

public abstract class Pizza {
	String name;
	Dough dough;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	Sauce sauce;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		return "Pizza name is "+name;
	}
}
