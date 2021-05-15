package com.decorator.pattern.geometryexample;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public void resize() {
		System.out.println("Resizing Circle");
	}

	@Override
	public String description() {
		return "Circle Object";
	}

	@Override
	public boolean isHide() {		
		return false;
	}

}
