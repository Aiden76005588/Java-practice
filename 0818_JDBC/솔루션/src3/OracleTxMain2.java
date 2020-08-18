import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTxService service = new OracleTxService();

		//insert
		//service.insert(new Dept(99,"개발","제주"));
		//delete
		//service.delete(88);
		
		service.insertDelete(new Dept(99,"개발","제주"),88);
		
		//1번클릭
		try {
			ArrayList<Dept> list= service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
