package patterns.design.test.structural;

/**
 * 1. It provides runtime modification abilities and hence more flexible.
 * 2. Its easy to maintain and extend when the number of choices are more.
 * 3. Used a lot in Java IO classes, such as FileReader, BufferedReader 
 */

/**
 * Component interface or abstract class
 */
interface Car{
	void assemble();
}

/**
 * Component implementation
 */
class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println("Basic Car");
	}
}

/**
 * Decorator class implements Component class
 * It has HAS-A relation with component interface
 * Component variable should be accessible to the child decorator classes, so we will make this variable protected
 */
class CarDecorator implements Car{

	protected Car car;
	
	public CarDecorator(Car car){
		this.car = car;
	}
	@Override
	public void assemble() {
		this.car.assemble();
	}	
}

/**
 * Concrete Decorator
 */
class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding Sports Car");
	}	
}

/**
 * Concrete Decorator
 */
class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding Luxury Car");
	}
}

public class DecoratorPattern {
	public static void testDecoratorPattern(){
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxurySportsCar.assemble();
	}
}
