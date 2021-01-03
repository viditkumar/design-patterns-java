package patterns.design.hf.factory;

public abstract class PizzaStore{

	// Abstract Factory method
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}