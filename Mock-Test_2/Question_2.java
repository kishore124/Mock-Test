package in.ineuron;

import java.util.Scanner;

abstract class Shape {
	public abstract double calculateArea();
}

class Rectangle extends Shape {

	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth");
		double breadth = sc.nextDouble();
		return length * breadth;
	}

}

class Circle extends Shape {

	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius = sc.nextDouble();
		double pi = 3.14159265359;
		return pi * radius * radius;
	}

}

class Triangle extends Shape {

	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Base");
		double base = sc.nextDouble();
		System.out.println("Enter Height");
		double height = sc.nextDouble();

		return 0.5 * base * height;
	}

}

class ShapeCalculator {
	public void printArea(Shape shape) {

		double area = shape.calculateArea();
		System.out.println("Area is " + area);
	}
}

public class Question_2 {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		Shape triangle = new Triangle();

		ShapeCalculator sh = new ShapeCalculator();
		sh.printArea(triangle);
		sh.printArea(circle);
		sh.printArea(rectangle);
	}

}
