package com.decorator.pattern.starbuzzcoffeesolutioncode;

public class StarbuzzCoffee {
	public static void main(String...args) {
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription()+" "+beverage1.cost());
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" "+beverage2.cost());
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Soy(beverage3);
		beverage3 = new SteamedMilk(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" "+beverage3.cost());
	}
}
