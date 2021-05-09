package com.decorator.pattern.starbuzzcoffeeproblemcode;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Beverage";
	}

	@Override
	double cost() {
		return 2.99;
	}

}
