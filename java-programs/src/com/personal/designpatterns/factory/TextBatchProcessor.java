package com.personal.designpatterns.factory;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor {

	public Parser createParser(File file) {
		return new TextParser(file);
	}

}
