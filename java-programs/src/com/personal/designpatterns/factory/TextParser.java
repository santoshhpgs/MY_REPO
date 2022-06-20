package com.personal.designpatterns.factory;

public class TextParser implements Parser {
	public TextParser() {
		System.out.println("Creating Text Parser.....");
	}

	public void openFile() {
		System.out.println("opened Text file...");
	}

	public void parse() {
		System.out.println("parsing Text and creating record list ..");
	}

	public void closeFile() {
		System.out.println("closed Text file");

	}
}
