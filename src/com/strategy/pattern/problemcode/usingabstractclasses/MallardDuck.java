package com.strategy.pattern.problemcode.usingabstractclasses;

public class MallardDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a Mallard Duck");
	}

	@Override
	void fly() {
		System.out.println("Mallard Ducks are flying");
	}

	@Override
	void quack() {
		System.out.println("Mallard Ducks are quacking");		
	}

	@Override
	void swim() {
		System.out.println("Mallard Ducks are swimming");		
	}

}
