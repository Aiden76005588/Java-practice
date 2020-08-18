


import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;




public class EmpTest {

	
	public static void main(String[] args)  {
		
		EmpBiz empBiz = new EmpBiz();
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		for(EmpDTO : list) {
			System.out.println();
		}
	}//end main
}//end class
