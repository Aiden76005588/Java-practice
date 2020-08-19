import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		List<Dept> list = service.select();
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
	}

}
