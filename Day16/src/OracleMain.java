import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) throws RecordNotFoundException {

		OracleService service = new OracleService();
		try {
			service.select(); // 전체데이터 출력
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//		service.insert(new Dept(91, "제조", "경기"));
			
		
//		try {
//			ArrayList<Dept> list = service.select();
//		 for(int i= 0; i<list.size();i++) {			
//		 	System.out.println(list.get(i).toString());
//		 }
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
		try {
			ArrayList<Dept> list = service.select();
		 for(Dept dept : service.select()) {			
		 	System.out.println(dept);
		 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("name", "개발");
//		map.put("loc", "제주");
//		try {
//			ArrayList<Dept> list = service.selectByNameLoc(map);
//			for(Dept dept : list) {
//				System.out.println(dept);
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		System.out.println("");
	}

}
