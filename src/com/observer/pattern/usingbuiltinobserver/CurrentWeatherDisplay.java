package com.observer.pattern.usingbuiltinobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeatherDisplay implements Observer,DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	public CurrentWeatherDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Temperature: "+temperature+" degrees, humidity: "+humidity+"%"+", pressure: "+pressure+" barometers");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData obj = (WeatherData)o;
			this.temperature = obj.getTemperature();
			this.humidity  = obj.getHumidity();
			this.pressure = obj.getPressure();
			display();
		}
		
	}

}
