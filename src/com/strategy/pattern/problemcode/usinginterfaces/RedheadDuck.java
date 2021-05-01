package com.strategy.pattern.problemcode.usinginterfaces;

public class RedheadDuck extends Duck implements Flyable, Quackable {

	@Override
	public void quack() {
		System.out.println("RedheadDuck is quacking");
	}

	@Override
	public void fly() {
		System.out.println("RedheadDuck is flying");
	}

	@Override
	void swim() {
		System.out.println("RedheadDuck is swimming");
	}

	@Override
	void display() {
		System.out.println("This is a redhead duck");
	}

}
