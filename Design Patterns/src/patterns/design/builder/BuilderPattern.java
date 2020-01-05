package patterns.design.builder;

public class BuilderPattern {

	public static void main(String[] args) {

		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
		Vehicle bike = new Vehicle.VehicleBuilder("200cc", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());
	}

}
