

public class workshop4_1 {

		
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student stu1= new Student("kim", 100, 90, 95, 89);
	Student stu2= new Student("Lee", 60, 70, 99, 98);
	Student stu3= new Student("Park", 68, 86, 60, 40);
		
	Student [] list = {stu1,stu2,stu3};
	   
    System.out.println("kim 평균:"+stu1.getAvg()+"학점:"+ stu1.getGrade());
    System.out.println("Lee 평균:"+stu2.getAvg()+"학점:"+ stu2.getGrade());
    System.out.println("Park 평균:"+stu3.getAvg()+"학점:"+ stu3.getGrade());
	}
 

}
