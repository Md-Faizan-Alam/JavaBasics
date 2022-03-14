package com.training.cg.shape;

public class DecoratorTest {
	public static void main(String[] args) {
		Shape square = new Square();
		
		Shape blueSquare = new BlueShapeDecorator(new Square());
		
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		
		System.out.println("Drawing Normal Square...");
		square.draw();
		
		System.out.println("Drawing Square with blue border...");
		blueSquare.draw();
		
		System.out.println("Drawing Rectangle with blue border...");
		blueRectangle.draw();
	}
}
