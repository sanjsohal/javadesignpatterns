package com.decorator.pattern.starbuzzcoffeeproblemcode;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	@Override
	double cost() {
		return 3.99;
	}

}
