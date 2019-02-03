package com.personal.designpatterns.prototype;

public class PrototypeCheck {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopname("Novelty");
		bs.loadData();

		BookShop bs1 = (BookShop) bs.clone();
		bs.setShopname("Novelty");

		bs.getBooks().remove(2);

		System.out.println(bs);
		System.out.println(bs1);
	}

}
