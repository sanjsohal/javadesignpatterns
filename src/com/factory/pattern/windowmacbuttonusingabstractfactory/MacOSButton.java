package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class MacOSButton implements Button{

	@Override
	public void paint() {
		System.out.println("This is a Mac OS Button");
	}

}
