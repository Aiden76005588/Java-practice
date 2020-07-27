
public class Stu_Test {
	String name;//멤버변수 객체생성,자동초기화, 객체정보 저장
	int age;
	public void printInfo() {//맴버메소드,객체생성, 호출사용, 동작관련
		int num=1;
		
		;
		System.out.println("printInfo() num====="+num);
		System.out.println(name+":"+age);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu_Test st_1 = new Stu_Test();
		st_1.name="홍길동";
		st_1.age=25;
		st_1.printInfo();	
		Stu_Test st_2 = new Stu_Test();
		st_2.name="에이콘";
		st_2.age=20;
		st_2.printInfo();	
		

	}

}
