package patterns.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

	private List<String> vehicleList;

	public Vehicle(List<String> vehicleList) {
		super();
		this.vehicleList = vehicleList;
	}

	public Vehicle() {
		super();
		this.vehicleList = new ArrayList<String>();
	}

	public void insertData() {
		vehicleList.add("Tata");
		vehicleList.add("Maruti");
	}

	public List<String> getVehicleList() {
		return vehicleList;
	}

	public Object clone() throws CloneNotSupportedException {

		List<String> temp = new ArrayList<>();
		for (int i = 0; i < this.vehicleList.size(); i++) {
			temp.add(this.vehicleList.get(i));
		}

		return new Vehicle(temp);
	}

}
