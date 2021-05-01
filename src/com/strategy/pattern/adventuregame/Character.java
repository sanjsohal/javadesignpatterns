package com.strategy.pattern.adventuregame;

public abstract class Character {
	WeaponBehavior weapon;
	abstract void fight();
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	public void doFight() {
		weapon.useWeapon();
	}
}
