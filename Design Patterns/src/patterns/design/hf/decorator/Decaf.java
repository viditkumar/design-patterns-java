package patterns.design.hf.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public int getCost() {
		return DecoratorConstants.DECAF_COST;
	}

}
