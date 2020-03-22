package patterns.design.composite;

public class SavingsAccount extends Account {

	private String id;
	private int balance;

	public SavingsAccount(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}
