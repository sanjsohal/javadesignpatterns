package com.observer.pattern.usingmultithreading;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	List<Observer> observers;
	private Object MUTEX = new Object();
	private boolean changed;
	private String message;
	public MyTopic() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		if(o == null) {
			throw new NullPointerException("Null Observer");
		} else {
			synchronized (MUTEX) {
				if(!observers.contains(o)) {
					observers.add(o);
				}
			}
		}
		
	}

	@Override
	public void deleteObserver(Observer o) {
		synchronized(MUTEX) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		synchronized(MUTEX) {
			if(!changed)
				return;
			this.changed = false;
			for(Observer o:observers) {
				o.update();
			}
		}
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to topic: "+msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

	@Override
	public Object getUpdate(Observer o) {
		return this.message;
	}

}
