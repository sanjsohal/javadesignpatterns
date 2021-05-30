package com.command.pattern.remotecontrolusinglambdasandmethodreference;

public class Stereo {
	private String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCd() {
		System.out.println("CD is set");
	}
	
	public void setDvd() {
		System.out.println("DVD is set");
	}
	
	public void setRadio() {
		System.out.println("Radio is set");
	}
	
	public void setVolume(int level) {
		System.out.println("Volume set is "+level);
	}
}
