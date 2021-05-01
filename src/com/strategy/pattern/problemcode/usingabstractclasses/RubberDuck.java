package com.strategy.pattern.problemcode.usingabstractclasses;

public class RubberDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a rubber duck");
	}

	@Override
	void fly() {
		
	}

	@Override
	void quack() {
		System.out.println("Rubber Ducks squeak");
		
	}

	@Override
	void swim() {
		System.out.println("Rubber Ducks are swimming");
	}

}
