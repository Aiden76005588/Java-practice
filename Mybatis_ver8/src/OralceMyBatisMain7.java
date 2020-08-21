import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain7 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		Dept dept1 = new Dept(77,"개발","인천");
		Dept dept2 = new Dept(78,"개발","서울");
		List<Dept> list=null;
		list =Arrays.asList(dept1,dept2);
		service.multiInsert(list);
		list = service.selectAll();
		for(Dept dept : list){
			System.out.println(dept);
		}
		
//		List<Dept> depts = Arrays.asList(dept1,dept2);
//		
////		List<Dept> depts=Arrays.asList(new Dept(12,"",""),new Dept(13,"",""));												
//		service.multiInsert(depts);	
//		
//		List<Dept> list = service.selectAll();
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		
		
	}

}
