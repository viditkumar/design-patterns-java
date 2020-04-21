package patterns.design.hf.strategy;

public class JetFlyStrategyImpl implements FlyStrategy {

	@Override
	public void fly() {
		System.out.println("You can't see me Fly");
	}
}
