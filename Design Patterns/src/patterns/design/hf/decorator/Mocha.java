package patterns.design.hf.decorator;

public class Mocha extends Decorator {
	
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " with Mocha";
	}

	@Override
	public int getCost() {
		return beverage.getCost() + DecoratorConstants.MOCHA_COST;
	}

}
