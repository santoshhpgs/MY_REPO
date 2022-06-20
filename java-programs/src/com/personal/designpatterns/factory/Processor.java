package com.personal.designpatterns.factory;

public class Processor {

	public void processBatch(String filename) {
		Parser parser = ParserFactory.createBatchProcessor(filename);// factory method
		parser.openFile();
		parser.parse();
		parser.closeFile();
	}
}
