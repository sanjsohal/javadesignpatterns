package com.strategy.pattern.adventuregame;

public class BowAndArrowBehavior implements WeaponBehavior	 {

	@Override
	public void useWeapon() {
		System.out.println("This is a bow and arrow behavior");
	}

}
