package com.observer.pattern.weatherstation;

public class CurrentWeatherDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentWeatherDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current weather display, temperature: "+temperature+" degrees, humidity: "+humidity+" pressure: "+pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
