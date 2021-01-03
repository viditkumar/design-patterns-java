package patterns.design.hf.factory;

/**
 * Factory Pattern defines an interface, for creating an object
 * but lets sub-classes to decide which class to instantiate
 * 
 * @author Vidit Kumar
 *
 */
public class FactoryPattern {

	public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyPizzaStore.orderPizza("NYCheese");
        System.out.println("Pizza: " + pizza.getName());
        
        pizza = chicagoPizzaStore.orderPizza("ChicagoCheese");
        System.out.println("Pizza: " + pizza.getName());
	}

}
