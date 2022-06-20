package com.personal.designpatterns.abstractfactorymethod;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
