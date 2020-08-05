package workshop_total;

public class workshop4_7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentArr [] = new Student1[3];
		studentArr [0] = new Student1("홍길동",15, 170,80);
		studentArr [1] = new Student1("한사람",13, 180,70);
		studentArr [2] = new Student1("임걱정",16, 175,65);
		
		double totalAge=0;
		double totalHeight=0;
		double totalWeight=0;
		int maxAge = 0;
		int minAge = 0;
		int maxHeight = 0;
		int minHeight = 0;
		int maxWeight = 0;
		int minWeight = 0;
		
		for(int i =0; i<studentArr.length; i++) {
			System.out.println(studentArr[i].studentInfo());
			
		}
			
		
		
		
	}

}
