package patterns.design.test.creational;

/**
 * 1. create static nested class
 * 2. copy all arguments from outer class to Builder class
 * 3. No public constructor in non-builder class
 * 4. follow naming convention, e.g., Computer -> ComputerBuilder
 * 5. Builder class to have public constructor with required parameters
 * 6. Builder class to have methods to set optional parameters
 * 7. build() method
*/

class BComputer{
	// required
	private String hardDisk;
	private String ram;
	
	// optional
	private boolean isGraphics;

	public String getHardDisk() {
		return hardDisk;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphics() {
		return isGraphics;
	}
	
	// main class has private constructor with Builder class as arguments
	private BComputer(BComputerBuilder builder) {
		this.hardDisk = builder.hardDisk;
		this.ram = builder.ram;
		this.isGraphics = builder.isGraphics;
	}
	
	public static class BComputerBuilder{ // static nested class
		// copy all parameters
		private String hardDisk;
		private String ram;
		private boolean isGraphics;
		
		// builder class has public constructor with only required parameters
		public BComputerBuilder(String hardDisk, String ram){
			this.hardDisk = hardDisk;
			this.ram = ram;
		}
		
		public BComputerBuilder setGraphics(boolean isGraphics){
			this.isGraphics = isGraphics;
			return this;
		}
		
		public BComputer build(){
			return new BComputer(this);
		}
	}
}
public class BuilderPattern {
	public static BComputer createComputer(){
		BComputer bComputer = new BComputer.BComputerBuilder("500GB", "2GB").build();
		return bComputer;
	}
}
