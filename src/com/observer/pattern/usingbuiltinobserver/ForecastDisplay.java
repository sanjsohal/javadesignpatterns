package com.observer.pattern.usingbuiltinobserver;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {
	private Observable observer;
	public ForecastDisplay(Observable observer) {
		this.observer = observer;
		observer.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Temperature will rise");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData obj = (WeatherData)o;			
			display();
		}
	}

}
