package patterns.design.hf.strategy;

public class StrategyPattern {

	public static void main(String[] args) {

		JetFlyStrategyImpl jetFlyStrategyImpl = new JetFlyStrategyImpl();
		DailyQuackStrategyImpl dailyQuackStrategyImpl = new DailyQuackStrategyImpl();

		NoFlyStrategyImpl noFlyStrategyImpl = new NoFlyStrategyImpl();
		NoQuackStrategyImpl noQuackStrategyImpl = new NoQuackStrategyImpl();

		Duck cloudDuck = new Duck(jetFlyStrategyImpl, dailyQuackStrategyImpl);
		System.out.println("Hey, I am cloud Duck!");
		cloudDuck.fly();
		cloudDuck.quack();

		Duck rubberDuck = new Duck(noFlyStrategyImpl, noQuackStrategyImpl);
		System.out.println("Hey, I am rubber Duck!");
		rubberDuck.fly();
		rubberDuck.quack();

	}
}
