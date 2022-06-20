package com.personal.designpatterns.abstractfactorymethod;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to DB");
	}

}
