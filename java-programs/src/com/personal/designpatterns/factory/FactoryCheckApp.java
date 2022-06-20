package com.personal.designpatterns.factory;

public class FactoryCheckApp {

	public static void main(String[] args) {
		Processor processor = new Processor();
		processor.processBatch("text");
		System.out.println("Done..");

	}
}
