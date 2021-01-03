package patterns.design.test.creational;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Used when object creation requires lot of time
 * 2. Similar object already exists
 * 3. Copy(clone) original to new object and then modify
 */

class Employee implements Cloneable {
	private List<String> employeeList;

	public Employee(){
		this.employeeList = new ArrayList<>();
	}
	public Employee(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	public List<String> getEmployeeList() {
		return this.employeeList;
	}
	public void loadData(){
		this.employeeList.add("Ram");
		this.employeeList.add("Shyam");
		this.employeeList.add("Mohan");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for(String s : this.getEmployeeList()){
			temp.add(s);
		}
		return new Employee(temp);
	}
}
public class PrototypePattern {
	public static void fetchEmployees() throws CloneNotSupportedException{
		Employee employee = new Employee();
		employee.loadData();
		
		Employee employee1 = (Employee) employee.clone();
		List<String> list1 = employee1.getEmployeeList();
		list1.add("Sohan");
		
		Employee employee2 = (Employee) employee.clone();
		List<String> list2 = employee2.getEmployeeList();
		list2.remove("Shyam");
		
		System.out.println("List: " + employee.getEmployeeList());
		System.out.println("List: " + list1);
		System.out.println("List: " + list2);
	}	
}
