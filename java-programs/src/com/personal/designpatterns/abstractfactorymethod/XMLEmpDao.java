package com.personal.designpatterns.abstractfactorymethod;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to XML");
	}

}
