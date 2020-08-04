package com.test4;
//class Employee{
//	String name;
//	int salary;
//	public String getEmployee() {
//		return name+"\t"+salary;
//	}
//	public Employee() {}
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//}
//class Manager extends Employee{
//	String depart;
//
//	@Override
//	public String getEmployee() {
//		// TODO Auto-generated method stub
//		return super.getEmployee()+" "+depart;
//	}
//	public Manager(String name, int salary, String depart) {
//		super(name,salary);
//		this.depart = depart;
//	}
//}
//
//public class Ex0_7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee emp = new Employee("홍길동",0);
//		System.out.println(emp.getEmployee());
//		
//		emp = new Manager("이순신",10,"개발");
//		System.out.println(emp.getEmployee());
//
//	}
//}

class Employee{
	String name;
	int salary;
	public String getEmployee() {
		return name+" "+salary;
	}
	public Employee() {}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
class Manager extends Employee{
	String depart;

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+" "+ depart;
	}
	public Manager(String name, int salary, String depart) {
		super(name,salary);
	}
	
}

public class Ex0_7{
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동",2000);
		System.out.println(emp.getEmployee());
		
		emp = new Manager("이순신",4000,"개발");
		System.out.println(emp.getEmployee());
	}
}