package patterns.design.composite;

public class CompositePattern {

	public static void main(String[] args) {
		CompositeAccount compositeAccount = new CompositeAccount();
		compositeAccount.addAccount(new DepositAccount("123", 123));
		compositeAccount.addAccount(new SavingsAccount("234", 234));

		int totBalance = compositeAccount.getBalance();
		System.out.println("Total: " + totBalance);
	}
}
