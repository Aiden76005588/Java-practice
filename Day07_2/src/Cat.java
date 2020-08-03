
// Cat is a Pet ==> 상속관계로 지정가능

public class Cat extends Pet{


	private String gender;
	
	//동작
	public void cryCat() {
		System.out.println("야옹~");
	}
	public void eatCat() {
		System.out.println("생선 먹기");
	}
	public void sleepCat() {
		System.out.println("새근새근~");
	}
	
	
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Cat생성자 호출=====");
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
