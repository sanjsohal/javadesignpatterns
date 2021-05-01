package com.singleton.pattern;

public class ChocolateBoilerUsingDoubleCheckedLocking {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoilerUsingDoubleCheckedLocking boiler = null;
	public static synchronized ChocolateBoilerUsingDoubleCheckedLocking getInstance() {
		if(boiler == null) {
			synchronized(ChocolateBoilerUsingDoubleCheckedLocking.class) {
				if(boiler == null) {
					boiler = new ChocolateBoilerUsingDoubleCheckedLocking();
				}
			}
		}
		return boiler;
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	private ChocolateBoilerUsingDoubleCheckedLocking() {
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
