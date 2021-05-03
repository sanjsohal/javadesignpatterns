package com.observer.pattern.usingbuiltinobserver;

public class WeatherStation {
	public static void main(String...args) {
		WeatherData weatherData = new WeatherData();
		CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(89, 84, 75);
	}
}
