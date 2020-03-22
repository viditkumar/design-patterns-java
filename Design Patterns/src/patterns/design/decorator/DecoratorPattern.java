package patterns.design.decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assemble();
		System.out.println();

		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assemble();
		System.out.println();

		Dress sportyfancyDress = new SportyDress(new FancyDress(new BasicDress()));
		sportyfancyDress.assemble();
		System.out.println();
	}
}
