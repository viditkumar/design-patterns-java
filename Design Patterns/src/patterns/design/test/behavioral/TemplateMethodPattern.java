package patterns.design.test.behavioral;

/*
 * Template method should consists of certain steps whose order is fixed and for some of the methods,
 * implementation differs from base class to subclass.
 * Template method should be final
 */

abstract class HouseTemplate {
	public final void buildHouse() { // Template method should be final
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement and iron rods");
	}

	public abstract void buildPillars();

	public abstract void buildWalls();

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
}

class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}
}

class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}
}

public class TemplateMethodPattern {
	public static void testTemplateMethodPattern() {
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();

		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}
}
