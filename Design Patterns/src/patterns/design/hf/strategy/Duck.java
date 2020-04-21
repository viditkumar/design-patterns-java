package patterns.design.hf.strategy;

public class Duck {

	private FlyStrategy flyStrategy;
	private QuackStrategy quackStrategy;

	public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
		super();
		this.flyStrategy = flyStrategy;
		this.quackStrategy = quackStrategy;
	}

	/**
	 * Here comes the role of Strategy Pattern. We don't specify the
	 * method/algorithm here Instead, we call the algorithm via interface
	 * 
	 * So, it is very easy to change the algorithm, without changing this class,
	 * that is simply pass another algorithm as constructor parameter
	 * 
	 * All this can be achieved by writing all the methods/algorithms in this
	 * class too
	 */

	public void fly() {
		this.flyStrategy.fly();
	}

	public void quack() {
		this.quackStrategy.quack();
	}
}
