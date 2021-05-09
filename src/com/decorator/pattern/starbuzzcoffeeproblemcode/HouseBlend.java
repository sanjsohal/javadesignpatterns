package com.decorator.pattern.starbuzzcoffeeproblemcode;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend";
	}

	@Override
	double cost() {
		return .99;
	}

}
