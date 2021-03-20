package patterns.design.test.structural;

/*
 * Decouple an abstraction from its implementation so that the two can vary independently
 * 
 * Used when both abstraction and implementation can have different hierarchies independently and 
 * we want to hide the implementation from the client application
 */

interface Color {
	public void applyColor();
}

abstract class Shape {
	// Composition - implementor
	protected Color color;

	// constructor with implementor as input argument
	public Shape(Color c) {
		this.color = c;
	}

	abstract public void applyColor();
}

class Triangles extends Shape {
	public Triangles(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}
}

class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}

class RedColor implements Color {

	public void applyColor() {
		System.out.println("red.");
	}
}

class GreenColor implements Color {

	public void applyColor() {
		System.out.println("green.");
	}
}

public class BridgePattern {
	public static void testBridgePattern() {
		Shape tri = new Triangles(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
