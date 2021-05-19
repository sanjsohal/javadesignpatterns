package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class WindowsCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("This is a windows checkbox");
	}

}
