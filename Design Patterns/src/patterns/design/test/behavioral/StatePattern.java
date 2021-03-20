package patterns.design.test.behavioral;

/*
 * Benefits of using State pattern to implement polymorphic behavior is clearly visible
 * The chances of error are less and it’s very easy to add more states for additional behavior
 * Thus making our code more robust, easily maintainable and flexible
 * Also State pattern helped in avoiding if-else or switch-case conditional logic in this scenario
 */

interface State {
	public void doAction();
}

/*
 * There are 2 states here, ON and OFF
 * So, creating 2 state class to implement the interface
 */
class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}
}

class TVStopState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}
}

// implement the Context object that will change its behavior based on its internal state
class TVContext implements State {
	private State tvState;

	public void setState(State state) {
		this.tvState = state;
	}

	public State getState() {
		return this.tvState;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}
}

public class StatePattern {
	public static void testStatePattern() {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();
	}
}
