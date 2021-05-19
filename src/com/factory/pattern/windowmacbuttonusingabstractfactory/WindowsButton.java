package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("This is a windows button");
	}

}
