
public class ArrayTest3 {

	public static void change(int n) {
		n =20;
	}
	public static void change2(int [] n) {
		n[2]=90;
	}
	public static void main(String[] args) {
		//기본형 데이터
		int xxx =10;
		System.out.println("호출전:"+ xxx);
		change(xxx);
		System.out.println("호출후:"+ xxx);		
		//참조형 데이터
		int [] num= new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println("호출전"+ num[2]);
		change2(num);
		System.out.println("호출전"+ num[2]);
	}//end main
}//end class




