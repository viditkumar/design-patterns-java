package patterns.design.hf.strategy;

public class DailyQuackStrategyImpl implements QuackStrategy{

	@Override
	public void quack() {
		System.out.println("I Quack daily");
	}
}
