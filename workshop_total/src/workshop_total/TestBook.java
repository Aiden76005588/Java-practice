package workshop_total;

public class TestBook {
	public Book[] arrPrint(Book[] books) {
		for(Book book : books) {
			System.out.println(book.getBookName()
			+"\t"+book.getBookPrice()
			+"\t"+book.getBookDiscountRate()
			+"\t"+book.getDiscount()
			+"원");
		}
		books[0]=new Book("AAAA",50000,5);
		return books;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("SQL Plus",50000,5.0);
		Book book2 = new Book("Java 2.0",40000,3.0);
		Book book3 = new Book("JSP Servlet",60000,6.0);
		
		Book[]books= new Book[3];
		books[0]=book1;
		books[1]=book2;
		books[2]=book3;
		TestBook test = new TestBook();
		Book[] returnbook= test.arrPrint(books);
		System.out.println(returnbook[0].getBookName());
		
		
	}

}
