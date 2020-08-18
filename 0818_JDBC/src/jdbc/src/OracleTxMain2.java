package jdbc.src;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.src.dto.Dept;
import jdbc.src.service.OracleTxService;

public class OracleTxMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTxService service = new OracleTxService();
		
		service.insertDelete(new Dept(99,"개발","제주"),88);
		
		//1번클릭
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
