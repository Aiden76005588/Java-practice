package workshop_total;

public class workshop4_7 {

	private static final Object[] Student_Oject = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Oject st1 = new Student_Oject("홍길동",15, 170,80);
		Student_Oject st2 = new Student_Oject("한사람",13, 180,70);
		Student_Oject st3 = new Student_Oject("임걱정",16, 175,65);
		
		Student_Oject [] list = {st1,st2,st3};
		
		int maxAge = 0;
		int minAge = 0;
		int maxHeight = 0;
		int minHeight = 0;
		int maxWeight = 0;
		int minWeight = 0;
		
		for(int i =0; i<Student_Oject.length; i++) {
			System.out.println(Student_Oject[i].studentInfo());
		}
			
		
		
		System.out.println("이름 나이 신장 몸무게");
		System.out.println(st1.studentInfo());
		System.out.println("나이가 가장많은 학생 "+st3.getName());
		
	}

}
