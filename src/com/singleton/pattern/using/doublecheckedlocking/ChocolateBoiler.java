package com.singleton.pattern.using.doublecheckedlocking;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler boiler = null;
	public static synchronized ChocolateBoiler getInstance() {
		if(boiler == null) {
			synchronized(ChocolateBoiler.class) {
				if(boiler == null) {
					boiler = new ChocolateBoiler();
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

	private ChocolateBoiler() {
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
