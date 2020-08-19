import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		//������ select  �Լ� ȣ��
		List<Dept> list = service.select();
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
		List<Dept> list2 = service.selectByDeptno();
		for(Dept dept : list2) {
			System.out.println(dept);
		}
		
//		List<Dept> list3 = service.insertByDept();
//		for(Dept dept : list3) {
//			System.out.println(dept);
//		}
//		
		List<Dept> list4 = service.selectByDeptnoUse();
		for(int i =0; i<list4.size(); i++) {
			System.out.println(list4.get(i).getDeptno());
		}
	}

}
