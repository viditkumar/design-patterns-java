package patterns.design.hf.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("NYCheese"))
			return new NYPizza();
		return null;
	}
}
