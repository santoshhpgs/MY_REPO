package com.personal.designpatterns.factory;

public class FactoryCheckApp {

	public static void main(String[] args) {
		// BatchProcessor batchProcessor = new BatchProcessor();
		// batchProcessor.processBatch(args[0]);
		// batchProcessor.processBatch("someinputfile","XML");

		// BatchProcessor batchProcessor = createBatchProcessor(args[1]);
		// batchProcessor.processBatch(args[0]);

		BatchProcessor batchProcessor = createBatchProcessor("xml");
		batchProcessor.processBatch("input file");
		System.out.println("Done..");

	}

	private static BatchProcessor createBatchProcessor(String arg) {
		if (arg.equals("text"))
			return new TextBatchProcessor();
		if (arg.equals("csv"))
			return new CSVBatchProcessor();
		if (arg.equals("xml"))
			return new XMLBatchProcessor();
		return null;
	}

}
