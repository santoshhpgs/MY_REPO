package com.personal.designpatterns.factory;

public class ParserFactory {

	public static Parser createBatchProcessor(String arg) {
		if (arg.equals("text"))
			return new TextParser();
		if (arg.equals("csv"))
			return new CSVParser();
		if (arg.equals("xml"))
			return new XMLParser();
		return null;
	}
}
