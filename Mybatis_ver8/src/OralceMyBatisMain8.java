import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain8 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		List<Dept> deptList3 = service.selectTopN(0,3);
		for(Dept dept : deptList3) {
			System.out.println(">>>"+dept);
		}
			
		
		
	}

}
