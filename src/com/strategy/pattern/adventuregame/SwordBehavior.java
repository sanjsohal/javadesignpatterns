package com.strategy.pattern.adventuregame;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("This is a sword behavior");
	}

}
