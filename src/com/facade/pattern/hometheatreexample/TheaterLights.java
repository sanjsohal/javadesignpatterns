package com.facade.pattern.hometheatreexample;

public class TheaterLights {
	public void dim(int intensity) {
		System.out.println("Theater Ceiling Lights dimming to "+intensity +"%");
	}
	public void on() {
		System.out.println("Theatre Ceiling Lights on");
	}
}
