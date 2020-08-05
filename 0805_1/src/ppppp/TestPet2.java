package ppppp;

public class TestPet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] c = {
				10,
				"홍길동",
				new Cat("야옹이",3,"암놈"),
				new Cat("야옹이",3,"암놈"),
				new Dog("누렁이",8,"숫놈","검정")								
		};
		for(Object object : c) {
			System.out.println(object);//동적바인딩 .toString()
		}
		System.out.println("==========");
		Object x= 10;
	}

}
