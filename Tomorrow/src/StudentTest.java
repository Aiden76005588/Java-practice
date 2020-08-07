
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentArr[]=new Student[3];
		studentArr[0] = new Student("홍길동",15,170,80);
		studentArr[1] = new Student("한사람",13,180,70);
		studentArr[2] = new Student("임걱정",16,175,65);
		
		int maxAge = 0;
		
		for(int i=0; i<studentArr.length;i++) {
			if (studentArr[maxAge].getAge() < studentArr[i].getAge()) {
				maxAge = i;
			}
		}
		System.out.println("나이가 가장 많은 학생 :"+studentArr[maxAge].getName());

	}

}
