package patterns.design.decorator;

public class BasicDress implements Dress {

	@Override
	public void assemble() {
		System.out.println("Basic Dress");
	}
}
