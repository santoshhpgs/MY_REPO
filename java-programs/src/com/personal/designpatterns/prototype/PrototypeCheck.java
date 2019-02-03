package com.personal.designpatterns.prototype;

public class PrototypeCheck {

	public static void main(String[] args) {
		BookShop bs = new BookShop();
		bs.setShopname("Novelty");
		bs.loadData();
		System.out.println(bs);
	}

}
