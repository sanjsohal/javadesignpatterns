package com.facade.pattern.hometheatreexample;

public class Amplifier {
	public void on() {
		System.out.println("Amplifier is on");
	}
	public void setDvd(DvdPlayer dvd) {
		System.out.println("Dvd Player is set");
	}
	public void setSurroundSound() {
		System.out.println("Surround sound is set");
	}
	public void setVolume(int level) {
		System.out.println("Volume is set");
	}
	public void off() {
		System.out.println("Amplifier is off");
	}
}
