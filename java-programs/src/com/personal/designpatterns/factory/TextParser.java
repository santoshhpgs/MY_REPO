package com.personal.designpatterns.factory;

import java.io.File;
import java.util.List;

public class TextParser 
{
	public TextParser(File file)
	{
		System.out.println("Creating Text Parser.....");
	}
	
	public List<Record> parse()
	{
		System.out.println("parsing text and creating record list ..");
		return null;
	}
}
