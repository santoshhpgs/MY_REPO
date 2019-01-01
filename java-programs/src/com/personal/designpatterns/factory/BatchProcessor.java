package com.personal.designpatterns.factory;

import java.io.File;
import java.util.List;



public class BatchProcessor 
{
	public void processBatch(String filename) {
		File file = openFile(filename);
		TextParser parser = new TextParser(file);
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
		
	}

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
