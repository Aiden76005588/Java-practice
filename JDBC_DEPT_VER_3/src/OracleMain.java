import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		
//		//4번 클릭
//		service.delete(99);
//	
//		//3번 클릭
//		Dept xx2 =new Dept(99, "영업", "서울"); 
//		try {
//			service.update(xx2);
//		} catch (RecordNotFoundException e1) {
//		System.out.println(e1.getMessage());
//		}
//		
//		//2번클릭
//		int deptno = 99;
//		String dname="개발";
//		String loc ="제주";
//		Dept xx =new Dept(deptno, dname, loc); 
//		service.insert(xx);
//		
//		
//		
		//1번클릭
		HashMap<String,String> map= new HashMap<>();
		map.put("dname", "영업");
		map.put("loc", "제주");
		try {
			ArrayList<Dept> list= service.selectByNameLoc(map);
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
