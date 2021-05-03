package com.observer.pattern.usingmultithreading;

public interface Subject {
	
	//method to add observer who want to listen to topic.
	public void addObserver(Observer o);
	//method to remove observer who no longer want to listen to topic.
	public void deleteObserver(Observer o);
	//method to notify the subscribed observers;
	public void notifyObservers();
	//method to get updates from subject
	public Object getUpdate(Observer o);
}
