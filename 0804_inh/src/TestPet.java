
public class TestPet {
	public void petPrint(Pet pet) {
//		System.out.println("petPrint()호출됨"+pet.printInfo());
		if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
//			System.out.println(cat.getGender());
//			System.out.println(cat.printInfo());
		} else if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			System.out.println(dog.getGender());
			System.out.println(dog.printInfo());
		} else if (pet instanceof Fish) {
			Fish fish = (Fish) pet;
			System.out.println(fish.getGender());
			System.out.println(fish.printInfo());
		} else if (pet instanceof Pet) {
			System.out.println(pet.printInfo());
		} else {
			System.out.println("똑바로 넣으세요.");
		}

	}

	public static void main(String[] args) {

		// 고양이 2마리,강아지 1마리 ,물고기 1마리
//		Cat c = new Cat("야옹이", 3, "암놈");
//		Cat c2 = new Cat("고양이",5,"숫놈");
//		Dog d = new Dog("강아지",2,"숫놈", "블루");
//		Fish f = new Fish("물고기",1,"무성",12.1123);

		// Pet c = new Cat("야옹이",1,"암");
		// 부모타입 변수로 자식객체 저장이 가능하다.cat,dog..
		// System.out.println(c.printInfo());
		// 부모타입 변수로 오버라이딩된 자식 객체함수 호출됨-동적바인딩
//		System.out.println(c.getGender());
		// 부모타입 변수로 실제 자식객체를 가지고 있어도 자식 객체의
		// 유일한 함수, 변수 접근이 안됨.
		// Cat cat = (Cat)c;
		// 객체의 유일 변수, 함수접근을 위해 실제 객체ㅏ입으로 변환(타입캐스팅)

		// Pet f = new Fish("물고기",1,"ㄴ",12.11);
		// Fish fish = (Fish)f;

		// System.out.println(c.printInfo());
		// System.out.println(f.printInfo());

		Pet c = new Cat("야옹이", 1, "암");
//		System.out.println(c.printInfo());
//		Dog d = new Dog("강아지", 10, "암","검정");
		Pet d = new Dog("강아지", 10, "암", "검정");
//		System.out.println(d.printInfo());
		Pet f = new Fish("물고기", 10, "암", 12.111);
//		System.out.println(f.printInfo());
//		Cat c1 =(Cat)c;
//		System.out.println(c1.getGender());
//		Dog d1 =(Dog)d;
//		System.out.println(d1.getColor());
//		Fish f1 = (Fish)f;
//		System.out.println(f1.getTailSize());

		TestPet test = new TestPet();
		test.petPrint(d);
		test.petPrint(c);
		test.petPrint(f);

	}

}
