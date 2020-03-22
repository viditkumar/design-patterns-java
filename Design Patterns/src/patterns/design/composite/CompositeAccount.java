package patterns.design.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account {

	private int totBalance;
	private List<Account> accs = new ArrayList<Account>();

	public void addAccount(Account ac) {
		accs.add(ac);
	}

	public int getBalance() {
		totBalance = 0;
		for (int i = 0; i < accs.size(); i++) {
			totBalance += accs.get(i).getBalance();
		}
		return totBalance;
	}
}
