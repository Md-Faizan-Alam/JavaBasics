package com.training.cg.shape;

public class BlueShapeDecorator extends ShapeDecorator{
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueBorder(decoratedShape);
	}
	
	private void setBlueBorder(Shape decoratedShape) {
		System.out.println("Shape border color : Blue");
	}
}
