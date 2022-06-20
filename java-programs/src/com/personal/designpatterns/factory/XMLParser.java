package com.personal.designpatterns.factory;

public class XMLParser implements Parser {


	public XMLParser() {
		
		System.out.println("created XML parser");
	}
	
	public void openFile() {
		System.out.println("opened XML file...");
	}

	public void parse() {
		System.out.println("parsing XML and creating record list ..");
	}

	public void closeFile() {
		System.out.println("closed XML file");

	}

}
