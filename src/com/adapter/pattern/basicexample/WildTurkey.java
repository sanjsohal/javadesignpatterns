package com.adapter.pattern.basicexample;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Wild Turkey is gobbling");
	}

	@Override
	public void fly() {
		System.out.println("Wild Turkey fly short distance");
	}

}
