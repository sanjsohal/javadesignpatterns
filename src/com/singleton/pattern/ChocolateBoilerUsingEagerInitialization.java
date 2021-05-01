package com.singleton.pattern;

public class ChocolateBoilerUsingEagerInitialization {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoilerUsingEagerInitialization boiler = new ChocolateBoilerUsingEagerInitialization();
	public static synchronized ChocolateBoilerUsingEagerInitialization getInstance() {		
		return boiler;
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	private ChocolateBoilerUsingEagerInitialization() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		System.out.println("Filling Chocolate and Milk");
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		System.out.println("Draining Choclate and Milk");
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		System.out.println("Boiling Chocolate and Milk");
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
}

