package com.observer.pattern.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement{	
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Temperature will rise");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		display();
	}

}
