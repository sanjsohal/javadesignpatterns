package com.strategy.pattern.simuduckproblemsolution;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("This is a model duck");
	}

}
