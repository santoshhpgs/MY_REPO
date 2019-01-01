package com.personal.designpatterns.factory;

public class FactoryCheckApp {

	public static void main(String[] args) {
	BatchProcessor batchProcessor = new BatchProcessor();
	//batchProcessor.processBatch(args[0]);
	batchProcessor.processBatch("someinputfile");
	System.out.println("Done..");

	}

}
