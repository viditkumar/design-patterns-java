package patterns.design.test.creational;

public class DesignPatternTest {
	public static void main(String[] args) {
		SingletonPattern singletonPattern = SingletonPattern.getSingletonInstance();
		System.out.println("SingletonPattern: " + singletonPattern);
		
		Computer dellComputer = FactoryPattern.searchComputer("DellPC", "500GB", "4GB");
		System.out.println("Dell: " + dellComputer.toString());
		
		Computer lenovoComputer = FactoryPattern.searchComputer("LenovoPC", "500GB", "6GB");
		System.out.println("Lenovo: " + lenovoComputer.toString());
		
		AbsComputer absDellComputer = AbstractFactoryPattern.searchComputer(new DellFactory("600GB", "8GB"));
		System.out.println("AbsDell: " + absDellComputer.toString());
		
		AbsComputer absLenovoComputer = AbstractFactoryPattern.searchComputer(new LenovoFactory("600GB", "10GB"));
		System.out.println("Lenovo: " + absLenovoComputer.toString());
		
		BComputer bComputer = BuilderPattern.createComputer();
		System.out.println("Builder Computer: " + bComputer);
		
		try {
			PrototypePattern.fetchEmployees();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
