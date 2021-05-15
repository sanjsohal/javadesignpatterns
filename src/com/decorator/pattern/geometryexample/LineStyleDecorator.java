package com.decorator.pattern.geometryexample;

public class LineStyleDecorator extends ShapeDecorator {

	protected LineStyle style;
	
	public LineStyleDecorator(Shape shape, LineStyle style) {
		super(shape);
		this.style = style;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line Style: "+style);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description()+" drawn with "+style+" lines.";
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
