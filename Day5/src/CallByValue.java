
public class CallByValue {
	public void change(int num) {
		//call by value :
		//참조변수가 아니면 모두 인자변수에 복사됨, pdt변수들
		num =100;
		System.out.println("change num==" + num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1 ;
		System.out.println("호출전 num====="+num);
		CallByValue test=new CallByValue();
		test.change(num);
		System.out.println("호출 후 ㅜㅕㅡ============="+num);
		
		int[] num1 = {1,2,3,4};
		System.out.println("원래 배열");
		
		

	}

}
