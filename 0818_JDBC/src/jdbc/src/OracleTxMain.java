package jdbc.src;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.src.dto.Dept;
import jdbc.src.exception.RecordNotFoundException;
import jdbc.src.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		OracleTxService service = new OracleTxService();
//		service.insert(new Dept(99,"개발","제주"));
		//4번 클릭
		service.delete(99);
		
		//3번클릭
		Dept xx2 = new Dept(99,"영업","서울");
		try {
			service.update(xx2);
		}catch (RecordNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		
		//2번 클릭
		int deptno =99;
		String dname = "개발";
		String loc = "제주";
		Dept xx = new Dept(deptno, dname, loc);
		
		//1번 클릭
		try {
			ArrayList<Dept> list = service.select();
			for(Dept dept : list) {
				System.out.println(dept);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
