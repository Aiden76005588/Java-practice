import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service= new OracleMyBatisService();
//		Dept dept= service.selectByDeptno(12);
//		System.out.println(dept);
//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		Dept dept = new Dept();
		dept.setDname("영업");
		dept.setLoc("제주");
		List<Dept> list= service.selectByDeptNameAndLoc(dept);
		for(Dept dept2 : list) {
			System.out.println(dept2);
		}
		list =service.selectByDeptNameAndLoc(dept);
	}

}
