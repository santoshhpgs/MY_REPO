package com.personal.designpatterns.temp;

public class Factory {
	public static void main(String args[]) {
		//String country = args[0];
		Currency rupee = CurrencyFactory.createCurrency("india");/* India,Singapore,US */
		System.out.println(rupee.getSymbol());
	}
}
