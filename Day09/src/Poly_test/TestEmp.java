package Poly_test;

import java.util.Date;

public class TestEmp {
//	public void printEmp(Emp e) {
//		System.out.println(e.printInfo());
//
//	}
//
//	public void printEmpArr(Emp[] emp) {
//		for (int i = 0; i < emp.length; i++) {
//			printEmp(emp[i]);
//		}
//	}
//
//	public Emp printChildData(Emp[] arr, String name) {
//		Emp data = null;
//		for (Emp e : arr) {
//			if (name.equals(e.getName())) {
//				data = e;
//			}
//		}
//		return data;
//	}
//
//	public Emp[] createEmpArr() {
//		Emp man = new Man("홍길동", "영업부");
//		Emp man2 = new Man("이완용","영업부");
//		Emp en1 = new Eng("이순신", "제조업");
//		Emp en2 = new Eng("강감찬", "연구업");
//		Emp [] emp1 = new Emp[4];
//		emp1[0]=man;
//		emp1[1]=en1;
//		emp1[2]=en2;
//		emp1[3]= man2;
//		return emp1;
//
//	}
	

	public static void main(String[] args) {
		
		Emp e= new Emp("홍길동");
		System.out.println(e);
		Emp m = new Man("이순신","영업부");
		System.out.println(m);

//		Emp man = new Man("홍길동", "영업부");
//		Emp man2 = new Man("이완용","영업부");
//		Emp en1 = new Eng("이순신", "제조업");
//		Emp en2 = new Eng("강감찬", "연구업");
//		Emp [] emp1 = new Emp[4];
//		emp1[0]=man;
//		emp1[1]=en1;
//		emp1[2]=en2;
//		emp1[3]= man2;
//		
//		Date d= new Date();
//		System.out.println(d);//참조변수가 넣을시 jdk가 
//		                      //자동으로 d.toString()으로 변환
//		System.out.println(d.toString());
//		
//		
//		
//		
//		TestEmp test = new TestEmp();
	
		//		test.printEmp(en2);
		
	}

}
