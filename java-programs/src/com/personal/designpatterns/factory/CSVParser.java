package com.personal.designpatterns.factory;

public class CSVParser implements Parser {

	public CSVParser() {
		
		System.out.println("created CSV parser");
	}

	public void openFile() {
		System.out.println("opened CSV file...");
	}

	public void parse() {
		System.out.println("parsing CSV and creating record list ..");
	}

	public void closeFile() {
		System.out.println("closed CSV file");

	}

}
