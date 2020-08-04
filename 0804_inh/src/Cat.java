
public class Cat extends Pet {

	String gender; // 유일속성
	// 동작

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		
		return name + " " + age + " " + gender;
	}

	public void petPrint() {
		
	}
	public void cryCat() {
		System.out.println("야옹~");
	}

	public void eatCat() {
		System.out.println("생선 먹기");
	}

	public void sleepCat() {
		System.out.println("새근새근~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}