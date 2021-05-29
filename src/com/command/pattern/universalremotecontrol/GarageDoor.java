package com.command.pattern.universalremotecontrol;

public class GarageDoor {
	private String name;
	
	public GarageDoor(String name) {
		this.name = name;
	}
	
	public void up() {
		System.out.println("Garage Door is up");
	}
	
	public void down() {
		System.out.println("Garage Door is down");
	}
	
	public void stop() {
		System.out.println("Garage Door is stopped");
	}
	
	public void lightOn() {
		System.out.println("Garage Door light is on");
	}
	
	public void lightOff() {
		System.out.println("Garage Door light is off");
	}
}
