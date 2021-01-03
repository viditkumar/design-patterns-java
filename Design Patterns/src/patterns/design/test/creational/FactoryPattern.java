package patterns.design.test.creational;

abstract class Computer {
	public abstract String getHardDisk();

	public abstract String getRAM();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHardDisk();
	}
}

class DellPC extends Computer {
	private String hardDisk;
	private String ram;

	public DellPC(String hardDisk, String ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	@Override
	public String getHardDisk() {
		return this.hardDisk;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}
}

class LenovoPC extends Computer {
	private String hardDisk;
	private String ram;

	public LenovoPC(String hardDisk, String ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	@Override
	public String getHardDisk() {
		return this.hardDisk;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}
}

public class FactoryPattern {
	public static Computer searchComputer(String type, String hardDisk, String ram) {
		if ("DellPC".equalsIgnoreCase(type))
			return new DellPC(hardDisk, ram);
		else
			return new LenovoPC(hardDisk, ram);
	}
}
