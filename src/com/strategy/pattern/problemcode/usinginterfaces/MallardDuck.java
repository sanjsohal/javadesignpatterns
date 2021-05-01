package com.strategy.pattern.problemcode.usinginterfaces;

public class MallardDuck extends Duck implements Flyable,Quackable {

	@Override
	public void quack() {
		System.out.println("Mallard Duck is quacking");
	}

	@Override
	public void fly() {
		System.out.println("Mallard Duck is flying");		
	}

	@Override
	void swim() {
		System.out.println("Mallard Duck is swimming");
	}

	@Override
	void display() {
		System.out.println("This is a mallard duck");
	}

}
