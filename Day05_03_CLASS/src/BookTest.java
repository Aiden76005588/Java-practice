
public class BookTest {
	
public static void main(String[] args) {
	
	Book book1 = new Book();
	Book book2 = new Book();
//	book1.name = "sss";
//	book1.price = 10000;
//	book2.name = "aaaa";
//	book2.price = 15000;
	book1.setName("해리포터");
	book1.setPrice(10000);
	book2.setName("반지의 제왕");
	book2.setPrice(15000);
	
	
	
	
	System.out.println(book1.getName());
	System.out.println(book2.getName());
}

}
