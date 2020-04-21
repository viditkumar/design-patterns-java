package patterns.design.hf.strategy;

public class NoFlyStrategyImpl implements FlyStrategy {

	@Override
	public void fly() {
		System.out.println("I can't Fly");
	}
}
