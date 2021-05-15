package com.decorator.pattern.starbuzzcoffeesolutioncode;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
