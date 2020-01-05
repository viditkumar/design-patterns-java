package patterns.design.factory;

public class VehicleFactory {

	// Factory class has a static method that return the instance of sub class
	// based on the input
	public static Vehicle getInstance(String type, int wheel) {
		if (type == "car") {
			return new Car(wheel);
		} else {
			return new Bike(wheel);
		}
	}

}
