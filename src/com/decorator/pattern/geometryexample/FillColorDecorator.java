package com.decorator.pattern.geometryexample;

public class FillColorDecorator extends ShapeDecorator {
	
	protected Color color;

	public FillColorDecorator(Shape shape,Color color) {
		super(shape);
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Fill color: "+color);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description()+" filled with "+color +" color.";
	}

	@Override
	public boolean isHide() {		
		return decoratedShape.isHide();
	}

}
