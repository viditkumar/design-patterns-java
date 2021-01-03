package patterns.design.hf.factory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		if(type.equals("NYCheese"))
			return new NYPizza();
		else
			return new ChicagoPizza();
	}
}
