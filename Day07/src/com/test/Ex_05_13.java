package com.test;
class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getInfo() {
		return title + "\t"+ author+"\t"+price;
	}
	}

public class Ex_05_13 {
	public static void changeBook(Book book) {
		book.title = "Java8";
		book.price = 3000;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("Java", "인경열", 2000);
		System.out.println("main의 변경전 info: " + book.getInfo());
		changeBook(book);
		System.out.println("main의 변경후 info: " +book.getInfo());
		

	}

}
