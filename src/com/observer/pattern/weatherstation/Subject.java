package com.observer.pattern.weatherstation;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifiyObservers();
}
