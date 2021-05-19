package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class MacOSCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("This is a Mac OS Checkbox");
	}

}
