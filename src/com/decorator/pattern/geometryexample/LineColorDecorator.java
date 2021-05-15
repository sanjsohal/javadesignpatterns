package com.decorator.pattern.geometryexample;

public class LineColorDecorator extends ShapeDecorator {
	
	protected Color color;

	public LineColorDecorator(Shape shape, Color color) {
		super(shape);		
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line color: "+color);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description()+" drawn with "+color+" color.";
	}

	@Override
	public boolean isHide() {		
		return decoratedShape.isHide();
	}

}
