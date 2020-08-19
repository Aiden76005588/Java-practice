import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		// select //sqlsession 리턴값 출력
		List<Dept> list = service.select();//서비스클래스 함수 호출
		
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
	}
}
