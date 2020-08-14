import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
				int deptno = 99;
		String dname="개발";
		String loc ="제주";
		Dept xx =new Dept(deptno, dname, loc); 
		service.insert(xx);
		
	}

}
