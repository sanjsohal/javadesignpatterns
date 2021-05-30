package com.command.pattern.remotecontrolusinglambdasandmethodreference;

public class CeilingFan {
	private String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	public void high() {
		System.out.println("Ceiling Fan is at High speed");
	}
	
	public void medium() {
		System.out.println("Ceiling Fan is at Medium speed");
	}
	
	public void low() {
		System.out.println("Ceiling Fan is at Low speed");
	}
	
	public void off() {
		System.out.println("Ceiling Fan is turned off");
	}
	
	public void getSpeed() {
		System.out.println("The current speed of fan is 40kmph");
	}
}
