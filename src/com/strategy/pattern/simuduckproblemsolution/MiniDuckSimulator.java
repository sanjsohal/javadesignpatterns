package com.strategy.pattern.simuduckproblemsolution;

public class MiniDuckSimulator {
	public static void main(String...args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehaviour(new FlyWithRocketSpeed());
		modelDuck.performFly();
	}
}
