package com.personal.designpatterns.factory;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	//public void processBatch(String filename, String format) {
	public void processBatch(String filename) {
		File file = openFile(filename);
		
		Parser parser = createParser(file);//factory method
		
		
		/*TextParser parser = null;
		if (format.equals("text"))
			parser = new TextParser(file);
		else if (format.equals("CSV"))
			parser = new CSVParser(file);
		else if (format.equals("XML"))
			parser = new XMLParser(file);*/
		
		
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);

	}
	
	//factory method
	public abstract Parser createParser(File file);

	private File openFile(String filename) {
		System.out.println("opened file...");
		return null;
	}

	private void processRecords(List<Record> records) {
		System.out.println("processing each records db.. etc..");

	}

	private void writeSummary() {
		System.out.println("Wrote batch summary - 0 failed");

	}

	private void closeFile(File file) {
		System.out.println("closed file");

	}
}
