
public class Member_Test {// class 블럭
	//멤버, 인스턴스변수  - class 블럭에 선언
	//선언 후 초기화 불필요 - 사용시 자동 초기화
	//함수 안에서 new로 필요한 만큼 객체 생성 사용.
	static int num=10; //객체생성없이 사용가능
	String name="박아무개";
	String phoneNumber;
	String address;
	char gender;
	public void printInfo(){
		System.out.println(name+""+phoneNumber+" "+address);
	}
	
	public static void main(String[] args) {//Main 블럭
		// TODO Auto-generated method stub
		//로컬변수(메소드/함수에 선언된 변수), 선언+초기화 후 사용.
		int num=10;
		System.out.println("로컬변수 "+num);
		System.out.println(Member_Test.num);//static변수의 사용
		Member_Test mem0=new Member_Test();	
		System.out.println(mem0.name);//에러발생-객체생성 필요
						
		Member_Test mem1= new Member_Test();//객체생성
		mem1.name="홍길동";//생성객체 접근 name맴버변수 저장
		Member_Test mem2= new Member_Test();//객체생성
		mem2.name="이순신";//생성객체 접근 name맴버변수 저장
		mem1.printInfo();
		mem2.printInfo();
		Member_Test mem3= new Member_Test();//객체생성
		mem3.name="이철원"; mem3.address="서울";//생성객체 접근 name맴버변수 저장
		System.out.println(mem1.name);
		System.out.println(mem3.name+" "+ mem3.address);
	}//Main 블럭

}//class블럭
