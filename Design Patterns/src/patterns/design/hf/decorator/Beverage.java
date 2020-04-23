package patterns.design.hf.decorator;

public abstract class Beverage {

	public String description = "Beverage";

	public String getDescription() {
		return description;
	}

	public abstract int getCost();

}
