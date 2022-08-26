package com.personal.object.cloning;

public class Address implements Cloneable {
	private String city;
	private String state;
	private int pinCode;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Address(String city, String state, int pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
