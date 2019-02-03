package com.personal.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {

	private String shopname;
	List<Book> books = new ArrayList<Book>();
	
	public void loadData()
	{
		
		for(int i=0;i<10;i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book " +i);
			getBooks().add(b);
		}
	}
	public String getShopname() {
		return shopname;
	}
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
