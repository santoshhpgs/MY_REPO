package com.personal.designpatterns.factory;

import java.io.File;

public class XMLBatchProcessor extends BatchProcessor {

	public Parser createParser(File file) {
		return new XMLParser(file);
	}

}
