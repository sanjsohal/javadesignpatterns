package com.strategy.pattern.problemcode.usingabstractclasses;

public class RedheadDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a redhead duck");
	}

	@Override
	void fly() {
		System.out.println("Redhead Ducks are flying");
	}

	@Override
	void quack() {
		System.out.println("Redhead Ducks are quacking");
	}

	@Override
	void swim() {
		System.out.println("Redhead Ducks are swimming");
	}

}
