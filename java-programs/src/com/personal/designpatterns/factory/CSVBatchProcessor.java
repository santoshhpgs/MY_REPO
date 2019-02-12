package com.personal.designpatterns.factory;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor {

	public Parser createParser(File file) {
		return new CSVParser(file);
	}

}
