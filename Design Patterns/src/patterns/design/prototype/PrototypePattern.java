package patterns.design.prototype;

import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Vehicle a = new Vehicle();
		a.insertData();

		// Used when you want to avoid multiple object creation of same instance
		// Instead, we copy it to new object, and then make the desired changes

		Vehicle b = (Vehicle) a.clone();
		List<String> list = b.getVehicleList();
		list.add("Sumo");

		System.out.println(a.getVehicleList());
		System.out.println(list);

		b.getVehicleList().remove(0);
		System.out.println(list);

		System.out.println(a.getVehicleList());

	}
}
