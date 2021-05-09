package com.decorator.pattern.starbuzzcoffeeproblemcode;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Most Excellent Dark Roast";
	}
	@Override
	double cost() {
		return 1.99;
	}

}
