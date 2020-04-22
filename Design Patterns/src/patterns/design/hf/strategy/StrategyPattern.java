package patterns.design.hf.strategy;

/**
 * Strategy Pattern defines a family of algorithms. It encapsulates (we used
 * interfaces here) each one of them, and makes them interchangeable (you can
 * plug and play). Strategy lets the algorithm vary independently from the
 * client that uses.
 * 
 */
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
