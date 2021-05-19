package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class WindowsOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
