package com.decorator.pattern.geometryexample;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	public ShapeDecorator(Shape shape) {
		this.decoratedShape = shape;
	}
}
