package patterns.design.test.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * Base
 * It can be an interface or an abstract class with some methods common to all the objects
 */
interface Shapes{
	void draw(String color);
}

/**
 * Leaf
 * It implements base component
 */
class Triangle implements Shapes{

	@Override
	public void draw(String color) {
		System.out.println("Triangle: " + color);
	}
}

/**
 * Leaf
 * It implements base component
 */
class Circle implements Shapes{

	@Override
	public void draw(String color) {
		System.out.println("Circle: " + color);
	}
}

/**
 * Composite
 * It behaves same as leaf, but it can contain group of leaf elements
 * It consists of leaf elements and implements the operations in base component
 */
class Drawing implements Shapes{

	List<Shapes> shapes = new ArrayList<>();
	
	@Override
	public void draw(String color) {
		for(Shapes shape : shapes)
			shape.draw(color);
	}
	
	public void addShape(Shapes shape){
		shapes.add(shape);
	}
	
	public void removeShape(Shapes shape){
		shapes.remove(shape);
	}
	
	public void clearAllShape(){
		shapes.clear();
		System.out.println("Cleared all shapes!");
	}
}

/**
 * should be applied only when the group of objects should behave as the single object
 * can be used to create a tree like structure
 */
public class CompositePattern {
	public static void testCompositePattern(){
		Triangle tr1 = new Triangle();
		Triangle tr2 = new Triangle();
		Circle cr = new Circle();
		
		Drawing draw = new Drawing();
		draw.addShape(tr1);
		draw.addShape(tr2);
		draw.addShape(cr);
		draw.draw("Red");
		
		draw.clearAllShape();
		draw.addShape(tr2);
		draw.addShape(cr);
		draw.draw("Green");
	}
}
