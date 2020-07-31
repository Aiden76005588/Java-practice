
public class Student {	
	
	private String name;
	//생성가능, 다른 클래스에서 접근불가
	private int age;
	private String address;
	private Book writtenBook;
	
	public void setWrittenbook(Book writtenBook) {
		this.writtenBook = writtenBook;
	}
	
	public Book getWrittenbook() {
		return writtenBook;
	}

	
	
	public Student() {//생성자, 기본생성자
		System.out.println("Student 생성자 호출");
		name="홍길동";
		age=10;
		address="강남구";
		
	}
	
	public String printInfo() {
		return name +" "+ age + " " + address;
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
