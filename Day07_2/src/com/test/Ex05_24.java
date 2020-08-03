package com.test;

class VarTest{
	public VarTest(int ...x) {
		System.out.println("생성자의 인자 갯수: " + x.length);
	}
	public void sayEcho(String ... names) {
		for(int x = 0 ; x< names.length; x++);		
		System.out.println(names[x]+"\t");		
	}
	
	
	 
}
public class Ex05_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarTest var = new VarTest(10);
		VarTest var2 = new VarTest(10,20);
		VarTest var3 = new VarTest(9,8,7,6,5);
		var.sayEcho("홍길동");
		var.sayEcho("서울","부산");
		var.sayEcho("여름","가을","겨울");
	}

}
