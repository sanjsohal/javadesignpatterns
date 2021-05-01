package com.strategy.pattern.adventuregame;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("This is an axe behavior");
	}

}
