package com.decorator.pattern.geometryexample;

public class Main {
	public static void main(String...args) {
		System.out.println("Creating simple shape objects");
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		System.out.println("Drawing simple shape objects");
		rectangle.draw();
		System.out.println();
		circle.draw();
		System.out.println();
        System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ...");
        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new LineThicknessDecorator(new Circle(), 2.0d), LineStyle.DASH),Color.BLUE),Color.RED);
        circle1.draw();
        System.out.println();
        System.out.println("creating object with similar functionalities in separate statements.");
        LineThicknessDecorator ltd = new LineThicknessDecorator(new Circle(),2.0d);
        LineStyleDecorator lsd = new LineStyleDecorator(ltd, LineStyle.DASH);
        LineColorDecorator lcd = new LineColorDecorator(lsd,Color.BLUE);
        FillColorDecorator fcd = new FillColorDecorator(lcd, Color.RED);
        Shape circle3 = fcd;
        circle3.draw();
        System.out.println();
        
        System.out.println("Creating Decorated Circle with Green Color, Black Lines ...");
        Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK),Color.GREEN);
        circle2.draw();
        System.out.println();
        
        System.out.println("Creating Decorated Rectange with Yellow Color, Red Lines in double dash pattern...");

        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new Rectangle(),LineStyle.DOUBLE_DASH),Color.RED),Color.YELLOW);
        rectangle1.draw();
	}
}
