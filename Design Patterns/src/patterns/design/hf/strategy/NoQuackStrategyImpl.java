package patterns.design.hf.strategy;

public class NoQuackStrategyImpl implements QuackStrategy{

	@Override
	public void quack() {
		System.out.println("I don't Quack");
	}
}
