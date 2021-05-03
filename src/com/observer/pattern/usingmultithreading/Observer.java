package com.observer.pattern.usingmultithreading;

public interface Observer {
	public void update();
	public void setSubject(Subject sub);
}
