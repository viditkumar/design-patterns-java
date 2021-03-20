package patterns.design.test.behavioral;

import java.util.Scanner;

/*
 * Used to achieve loose coupling in software design where a request from client is passed to a 
 * chain of objects to process them. Then the object in the chain will decide themselves 
 * who will be processing the request and whether the request is required to be sent to the 
 * next object in the chain or not
 * 
 * e.g., try-catch block, ATM machine
 * e.g., java.util.logging.Logger#log()
 * 
 */

class Currency {
	private int amount;

	public Currency(int amt) {
		this.amount = amt;
	}

	public int getAmount() {
		return this.amount;
	}
}

/*
 * base interface should have a method to define the next processor in the chain
 * and the method that will process the request
 */
interface DispenseChain {
	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}

class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 50) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}
}

class Dollar20Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}
}

class Dollar10Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}
}

/*
 * CREATING CHAIN
 */
class ATMDispenseChain {
	protected DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
}

public class ChainOfResponsibilityPattern {
	public static void testChainOfResponsibilityPattern() {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}
}
