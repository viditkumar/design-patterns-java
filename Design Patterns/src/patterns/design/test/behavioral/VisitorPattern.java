package patterns.design.test.behavioral;

/*
 * Used when we have to perform an operation on a group of similar kind of Objects
 * We can move the operational logic from the objects to another class
 * 
 * Benefit:
 * if the logic of operation changes, then we need to make change only in the visitor implementation,
 * rather than doing it in all the item classes
 * adding a new item to the system is easy
 * 
 * Drawbacks:
 * we should know the return type of visit() methods at the time of designing
 * if there are too many implementations of visitor interface, it makes it hard to extend
 */

interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	/*
	 * the implementation of accept() method in concrete classes, its calling
	 * visit() method of Visitor and passing itself as argument
	 */
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

class Fruit implements ItemElement {
	private int pricePerKg;
	private int weight;
	private String name;

	public Fruit(int priceKg, int wt, String nm) {
		this.pricePerKg = priceKg;
		this.weight = wt;
		this.name = nm;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		// apply 5$ discount if book price is greater than 50
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}

public class VisitorPattern {
	public void testVisitorPattern() {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"), new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
