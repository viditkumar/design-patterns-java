package patterns.design.factory;

public abstract class Vehicle {

	public abstract int getWheel();

	@Override
	public String toString() {
		return "Vehicle [getWheel()=" + getWheel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
