package patterns.design.builder;

public class Vehicle {

	private String engine;
	private int wheel;

	private int airbags;

	// Main class has private constructor, so to create instance only via
	// Builder class
	private Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.wheel = builder.wheel;
		this.airbags = builder.airbags;
	}

	// Main class has only getters
	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirbags() {
		return airbags;
	}

	// We create a ‘static nested class’ which contains all arguments of outer
	// class
	public static class VehicleBuilder {

		// required parameters
		private String engine;
		private int wheel;

		// optional parameters
		private int airbags;

		// Builder class have public constructor with all required parameters
		public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		// Builder class should have methods(e.g. setters) for optional
		// parameters. Method will return the builder object
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		// build() method that will return the final object
		public Vehicle build() {
			return new Vehicle(this);
		}

	}
}
