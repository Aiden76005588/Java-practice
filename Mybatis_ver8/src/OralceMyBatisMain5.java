import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
	
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("deptno", "제주");
		map.put("dname", "영업"); //key값을  이용한 검사
		List<Dept> list= service.selectDynamicChoose(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
