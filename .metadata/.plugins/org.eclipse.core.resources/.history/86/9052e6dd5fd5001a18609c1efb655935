package com.test;
class Employee{
	String name;
	int salary;
	public String getEmployee() {
		return name + "\t"+ salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Employee 부모생성자 호출==========");
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		
	}	
}//end class
class Manager extends Employee{
	String depart;
	public String getDepart() {
		return depart;
	}
	public Manager(String name, int salary,String depart) {
		this.name=name;
		this.salary= salary;
		this.depart = depart;
		System.out.println("Mananger 자식생성자 호출========");
	}
	public String getManger() {
		return name + "\t"+ salary+ "\t"+ depart;
	}
}//end class
public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp= new Employee("홍길동", 1000);
		Manager man = new Manager("이순신", 4000, "개발");
//		System.out.println(emp.getEmployee());
		System.out.println(man.getManger());
	}

}
