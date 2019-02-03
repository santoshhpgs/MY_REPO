package com.personal.objectclassmethods;

/*Equals and hashcode usage*/

public class Student {

	private String registrationNumber;

	public Student(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public boolean equals(Object obj) {
		System.out.println("Customized equals method invoked");
		if (obj != null && obj instanceof Student) {
			String regNumber = ((Student) obj).getRegistrationNumber();
			if (regNumber != null && regNumber.equals(this.registrationNumber)) {
				return true;
			}
		}
		return false;
	}

	
	public int hashCode() {
		System.out.println("Customized hashcode method invoked");
		return this.registrationNumber.hashCode();
	}
	
	@Override
	public String toString() {
		return "" + registrationNumber ;
	}
	
}
