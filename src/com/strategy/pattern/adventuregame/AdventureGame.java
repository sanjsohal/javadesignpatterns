package com.strategy.pattern.adventuregame;

public class AdventureGame {
	public static void main(String...args) {
		Character king = new King();
		king.setWeapon(new SwordBehavior());		
		king.doFight();
	}
}
