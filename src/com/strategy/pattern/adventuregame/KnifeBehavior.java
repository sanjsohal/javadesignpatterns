package com.strategy.pattern.adventuregame;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("This is a knife");
	}

}
