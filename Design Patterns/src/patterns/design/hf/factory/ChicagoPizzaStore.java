package patterns.design.hf.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("ChicagoCheese"))
			return new ChicagoPizza();
		return null;
	}
}
