package com.factory.pattern.windowmacbuttonusingabstractfactory;

public class Demo {	
	private static Application configureApplication() {
		GUIFactory factory;
		Application application;
		String osName = System.getProperty("os.name").toLowerCase();
		if(osName.contains("mac")) {
			factory = new MacOSFactory();
			application = new Application(factory);
		} else {
			factory = new WindowsOSFactory();
			application = new Application(factory);
		}
		return application;
	}
	public static void main(String...args) {
		Application application = configureApplication();
		application.paint();
	}
}
