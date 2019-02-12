package com.personal.designpatterns.factory;

import java.io.File;
import java.util.List;

public class XMLParser extends TextParser {


	public XMLParser(File file) {
		
		System.out.println("created XML parser");
	}
	
	public List<Record> parse()
	{
		System.out.println("parsing XML and creating record list ..");
		return null;
	}


}
