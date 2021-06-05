package com.templatemethod.pattern.solutionlevel1;

public abstract class CaffeineBeverage {
	abstract void prepareRecipe();
	public void boilWater() {
		System.out.println("Boiling water");
	}
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
