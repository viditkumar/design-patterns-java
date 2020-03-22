package patterns.design.composite;

public class DepositAccount extends Account {

	private String id;
	private int balance;

	public DepositAccount(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}
