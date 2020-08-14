import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		service.insert(new Dept(91, "제조", "경기"));
	
	}

}
