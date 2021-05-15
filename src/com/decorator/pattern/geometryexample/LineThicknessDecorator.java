package com.decorator.pattern.geometryexample;

public class LineThicknessDecorator extends ShapeDecorator {

	protected double thickness;
	
	public LineThicknessDecorator(Shape shape, double thickness) {
		super(shape);
		this.thickness = thickness;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line thickness: "+thickness);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description()+" drawn with line thickness "+thickness+".";
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
