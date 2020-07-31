
public class Student {	
	
	private String name;
	//생성가능, 다른 클래스에서 접근불가
	private int age;
	private String address;
	//생성자 수정 - 생성과 동시에 받아온 값으로 초기화
	
	public Student() {}//기본생성자를 명시적으로 꼭 기재할 것
	public Student(String name, int age, String address) {//생성자, 기본생성자
		System.out.println("Student 생성자 호출");
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	
	public String setName;
	public void setName(String name) {
		this.name = name;
	}//멤버변수 name  값 설정함수
	
	public void setStuinfo(String stuinfo) {
	}
	
	public String getStuinfo() {
		return name+"/"+age+"/"+address;
	}
	
	
	public String getName( ) {
		return name;
	}//멤버변수 name값을 필요한 곳으로 보내줒는 함수
	
	public void setAge(int age) {
		 this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}
