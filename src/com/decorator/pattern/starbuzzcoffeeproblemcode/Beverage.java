package com.decorator.pattern.starbuzzcoffeeproblemcode;

public abstract class Beverage {
	public String description;
	public String getDescription() {
		return description;
	}
	abstract double cost();
}
