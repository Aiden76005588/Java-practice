import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain6 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		Dept dept1 = new Dept();
		Dept dept2 = new Dept();
		dept1.setLoc("경기");
		dept2.setLoc("제주");
		
		List<Dept> depts = Arrays.asList(dept1,dept2);
		
//		List<Dept> depts=Arrays.asList(new Dept(12,"",""),new Dept(13,"",""));												
		service.multiDelete(depts);		
		List<Dept> list = service.selectAll();
		for(Dept dept : list) {
			System.out.println(dept);
		}
	}

}
