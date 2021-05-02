package com.observer.pattern.weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;	
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Average temperature: "+temperature+" degrees");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {		
		this.temperature = temperature;
		display();
	}


}
