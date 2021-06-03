package com.facade.pattern.hometheatreexample;

public class DvdPlayer {
	public void on() {
		System.out.println("Dvd player is on");
	}
	public void play(String movie) {
		System.out.println(movie+" is playing");
	}
	public void stop() {
		System.out.println("Dvd is stopped");
	}
	public void eject() {
		System.out.println("Dvd is ejected");
	}
	public void off() {
		System.out.println("Dvd is off");
	}
}
