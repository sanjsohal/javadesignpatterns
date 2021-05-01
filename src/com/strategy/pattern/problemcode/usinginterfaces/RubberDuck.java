package com.strategy.pattern.problemcode.usinginterfaces;

public class RubberDuck extends Duck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Rubber duck is squacking");
	}

	@Override
	void swim() {
		System.out.println("Rubber duck is swimming");
	}

	@Override
	void display() {
		System.out.println("This is rubber duck");		
	}
	
}
