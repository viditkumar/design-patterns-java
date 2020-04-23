package patterns.design.hf.decorator;

/**
 * Decorator Pattern attaches additional responsibilities to an object
 * dynamically. Decorator provide a flexible alternative to subclassing for
 * extending functionality.
 * 
 * @author Vidit Kumar
 *
 */
public class DecoratorPattern {

	public static void main(String[] args) {

		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " " + espresso.getCost());

		Beverage espressoMocha = new Mocha(new Espresso());
		System.out.println(espressoMocha.getDescription() + " " + espressoMocha.getCost());

		Beverage decafMocha = new Mocha(new Decaf());
		System.out.println(decafMocha.getDescription() + " " + decafMocha.getCost());

		Beverage espressoMochaWhip = new Whip(new Mocha(new Espresso()));
		System.out.println(espressoMochaWhip.getDescription() + " " + espressoMochaWhip.getCost());
	}

}
