package com.personal.object.cloning;

public class ShallowAndDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Bangaloe", "Karnatak", 12345);
		Employee employee1 = new Employee(1, "Santosh", "GL", address);
		Employee employee2  = (Employee) employee1.clone();
		employee2.setEmpId(2);
		employee2.getAddress().setPinCode(67890);
		System.out.println("employee1 >> " +employee1);
		System.out.println("employee2 >> " +employee2);
	}
}
