package patterns.design.test.creational;

abstract class AbsComputer {
	public abstract String getHardDisk();

	public abstract String getRAM();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHardDisk();
	}
}

class AbsDellPC extends AbsComputer {
	private String hardDisk;
	private String ram;

	public AbsDellPC(String hardDisk, String ram) {
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

class AbsLenovoPC extends AbsComputer {
	private String hardDisk;
	private String ram;

	public AbsLenovoPC(String hardDisk, String ram) {
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

/**
 * in abstract factory pattern, we create factory for every product
 * and avoid if-else
 */
interface ComputerFactory{
	public AbsComputer createComputer();
}

class DellFactory implements ComputerFactory{

	private String hardDisk;
	private String ram;

	public DellFactory(String hardDisk, String ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}
	@Override
	public AbsComputer createComputer() {
		return new AbsDellPC(hardDisk, ram);
	}
}

class LenovoFactory implements ComputerFactory{

	private String hardDisk;
	private String ram;

	public LenovoFactory(String hardDisk, String ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}
	@Override
	public AbsComputer createComputer() {
		return new AbsLenovoPC(hardDisk, ram);
	}
}
public class AbstractFactoryPattern {
	public static AbsComputer searchComputer(ComputerFactory computerFactory){
		return computerFactory.createComputer();
	}
}
