
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1= new Student();//default 생성자 호출
		Student stu2= new Student();//default 생성자 호출
		Student stu3= new Student();
		Book book1= new Book();
		book1.setName("해리포터");
		book1.setPrice(1000);
		stu1.setWrittenbook(book1);
		//학생1번의 책제목 확인
		Book stu1book= stu1.getWrittenbook();
		System.out.println(stu1book.getName());
		
		
		
		
//		System.out.println(stu1.getWrittenbook().getName()+stu1.getWrittenbook().getPrice());
		
		
//		System.out.println(stu1.printInfo());
//		System.out.println(stu1.getName());
//		System.out.println(stu2.getName());
//		stu1.setName("홍길동");
//		String name= stu1.getName();
//		stu1.setAge(20);
//		int age = stu1.getAge();
//		stu1.setAddress("서울");
//		String address= stu1.getAddress();
//		stu1.setStuinfo("학생정보");
//		String stuinfo = stu1.getStuinfo();
		
//		
					
//		
		
//		stu1.name="홍길동";
//		stu1.age =20;
//		stu1.address="서울"; 
//
//		stu2.name = "이순신";
//		stu2.age = 20;
//		stu2.address = "대구";
//
//		stu3.name = "이순신";
//		stu3.age = 20;
//		stu3.address = "부산";

//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(stuinfo);
//		System.out.println(stu2.name);
//		System.out.println(stu2.age);
//		System.out.println(stu2.address);
//		System.out.println(stu3.name);
//		System.out.println(stu3.age);
//		System.out.println(stu3.address);
	}

	
}
