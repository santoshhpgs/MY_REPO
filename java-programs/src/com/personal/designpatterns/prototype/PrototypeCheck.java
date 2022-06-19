package com.personal.designpatterns.prototype;

public class PrototypeCheck {

	public static void main(String[] args) throws CloneNotSupportedException {
//		BookShop bs = new BookShop();
//		bs.setShopname("Novelty");
//		bs.loadData();
//
//		BookShop bs1 = (BookShop) bs.clone();
//		bs.setShopname("Novelty");
//
//		bs.getBooks().remove(2);
//
//		System.out.println(bs);
//		System.out.println(bs1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("game1");
		game1.setMemberShip(new MemberShip(1,"member1"));
		Game game2 = game1.clone();
		
		System.out.println("game1 >>"+game1);
		System.out.println("game2 >>"+game2);
	}

}
