package com.strategy.pattern.problemcode.usinginterfaces;

public class DecoyDuck extends Duck{

	@Override
	void swim() {
		System.out.println("Decoy Duck is swimming");
	}

	@Override
	void display() {
		System.out.println("This is decoy duck");
	}

}
