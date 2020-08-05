
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1= new Student();
		Student stu2= new Student();
		Student stu3= new Student();
		
		stu1.name="홍길동";
		stu1.age =20;
		stu1.address="서울"; 

		stu2.name = "이순신";
		stu2.age = 20;
		stu2.address = "대구";

		stu3.name = "이순신";
		stu3.age = 20;
		stu3.address = "부산";

		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.address);
		System.out.println(stu3.name);
		System.out.println(stu3.age);
		System.out.println(stu3.address);
	}

}
