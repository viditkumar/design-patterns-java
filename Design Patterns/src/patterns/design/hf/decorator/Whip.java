package patterns.design.hf.decorator;

public class Whip extends Beverage {
	
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " with Whip";
	}

	@Override
	public int getCost() {
		return beverage.getCost() + DecoratorConstants.WHIP_COST;
	}

}
