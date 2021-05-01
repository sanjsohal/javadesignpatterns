package com.singleton.pattern;

public class ChocolateBoilerUsingSynchronizedMethod {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoilerUsingSynchronizedMethod boiler = null;
	public static synchronized ChocolateBoilerUsingSynchronizedMethod getInstance() {
		if(boiler == null) {
			boiler = new ChocolateBoilerUsingSynchronizedMethod();
		}
		return boiler;
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	private ChocolateBoilerUsingSynchronizedMethod() {
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

