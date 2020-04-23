package patterns.design.hf.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public int getCost() {
		return DecoratorConstants.ESPRESSO_COST;
	}

}
