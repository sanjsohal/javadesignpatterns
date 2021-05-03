package com.observer.pattern.usingbuiltinobserver;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Average temperature: "+temperature+" degrees");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData obj = (WeatherData)o;
			this.temperature = obj.getTemperature();			
			display();
		}
	}

}
