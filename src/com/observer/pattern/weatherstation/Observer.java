package com.observer.pattern.weatherstation;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
