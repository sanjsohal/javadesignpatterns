package com.strategy.pattern.problemcode.usingabstractclasses;

public class DecoyDuck extends Duck{

	@Override
	void quack() {
		
	}

	@Override
	void swim() {
		System.out.println("Decoy Ducks are swimming");
	}

	@Override
	void display() {
		System.out.println("These are decoy ducks");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		
	}

}
