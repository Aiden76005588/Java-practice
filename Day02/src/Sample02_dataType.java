
public class Sample02_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63)
		//1. 변수선언 ( 메모리에 특정크기의 영역생성)
		String name;// 변수 ,name,변수, 문자열 변수, Strng타입의 변수
		int age; // 변수, age변수, 정수형 변수,int
		String address; //참조형 변수
		char gender; // 변수,gender변수, 문자형 변수, char타입변수
		boolean isMarried; // 기본형변수
		float height;// 기본형변수  끝에 f표기		
		double weight; // 기본형 변수
		
		//2. 변수 초기화 ( 값을 맨처음 설정하는 작업)
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';
		isMarried = false;
		height = 185.63f;
//		heihght = 3.14;
		weight = 78.25;
		
		System.out.println("String name="+name);
		System.out.println("int age="+age);
		System.out.println("String address="+address);
		System.out.println("char gender="+gender);
		System.out.println("boolean isMarried="+isMarried);
		System.out.println("float height="+height);
		System.out.println("double weight="+weight);
		
	}

}
