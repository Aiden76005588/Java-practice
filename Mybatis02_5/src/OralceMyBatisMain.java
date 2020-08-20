import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		//service.insert(new Dept(99, "개발","강남"));
//		service.update(new Dept(99,"영업", "서울"));
//		Dept dept= service.selectByDeptno(99);
		service.delete(99);
		//System.out.println(dept);
		List<Dept> list= service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
//		HashMap<String, Integer> map = new HashMap<>(); //제네릭 항상 확인.
		
//		map.put("a", 20);
//		map.put("b", 40);
//		list = service.selectByHashMap(map);
//		System.out.println("해쉬맵=======");
//		for(Dept dept : list) {			
//			System.out.println(dept);
//		}
		System.out.println("해쉬맵=======");
//		map.put("aa", 10);
//		map.put("bb", 12);
//		map.put("cc", 40);
//		list = service.selectBydeptNoIn(map);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		HashMap<String, String> map = new HashMap<>();
//		 map = service.selectByDeptnoHashMap(10);//map에 10번의 데이터 담기
//		 Set<String> set = map.keySet();// map의 키를 확인하기 위한 set 생성
//		 for(String str : set ) {// 정보를 출력
//			 System.out.println(str);//출력결과 DNAME
//		 }
//		 map.get("dname");//NULL 출력 대소문자 구분
//		 System.out.println(map.get("DNAME"));//출력 ACCOUNTING
		 map = service.selectByDeptnoHashMap(20);
		 Set<String> set = map.keySet();
		 for(String str : set) {
			 System.out.println(str);
		 }
		 System.out.println(map.get("DNAME"));
		 
		
		
		 
		
		
		

	}

}
