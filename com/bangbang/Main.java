package com.bangbang;

public class Main {

	public static void main(String[] args) {

//Constructor con = new Constructor();

//		Constructor cons = new Constructor("Toyota", "Moedl", 0);
//
//		System.out.println(cons.getMake());
//		System.out.println(cons.getModel());
//		System.out.println(cons.getYear());
//		System.out.println(cons.getVin());
//		System.out.println(cons.getColor());

//		Circle circle = new Circle(-3.75);
//		System.out.println("circle radius " + circle.getRadius());
//		System.out.println("circle area " + circle.getArea());
//
//		Cylinder cylinder = new Cylinder(-5.55, 07.25);
//		System.out.println("cylinder radius " + cylinder.getRadius());
//		System.out.println("cylinder height " + cylinder.getHeight());
//
//		System.out.println("cylinder area " + cylinder.getArea());
//
//		System.out.println("cylinder volume " + cylinder.getVolume());

	
	
	Rectangle rectangle = new Rectangle(5, 10);
	System.out.println("length " + rectangle.getLength());
	System.out.println(" width " + rectangle.getWidth());
	System.out.println(" area " + rectangle.getArea());
	
	Cuboid cuboid = new Cuboid(5, 10, 15);
	System.out.println("length " + cuboid.getLength());
	System.out.println(" width " + cuboid.getWidth());
	System.out.println(" area " + cuboid.getArea());
	System.out.println(" height " + cuboid.getHeight());
	}

}
