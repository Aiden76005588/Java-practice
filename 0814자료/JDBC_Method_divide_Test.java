import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public JDBC_Method_divide_Test() {		//드라이버 로딩
	}
	public String search(String loc, String name) {
		//test.search("제주", null), search(null, "영업"), search("제주", "영업")
	//지역만 넘어온 경우 지역만 검색 결과 리턴
	//이름만 넘어온 경우 이름만 검색 결과 리턴
	//이름, 지역이 넘어온 경우 두 가지를 이용  And 검색 결과 리턴
	}
	public String  getAllDept(){
		//부서전체 select 
		//결과를 메인으로 리턴 메인에서 전체 데이터 출력 
	}
	public  String searchDeptByLoc(String loc){
		//주소로 select 
		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
	}
	public  String searchDeptByName(String dname){
		//부서이름으로로 select 
		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
	}
	public int updateDept(String dname, String loc, int deptno){
		//부서번호로 dname, loc업데이트 후 
		//업데이트 결과 갯수 리턴
	}
	public int insertDept(String dname, String loc, int deptno){
		//부서하나 추가후 
		//insert 결과 갯수 리턴
	}
	public String getdeptAdata(int deptno) {
		//부서번호로 select 
		//검색 결과가 없을 경우 사용자 정의 Exception 발생(RecordNotFoundException-메세지
		//찾는 부서 번호가 없습니다.
		//검색한 내용을 문자열로 리턴
			}
	public static void main(String[] args) {
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
		System.out.println(test.getdeptAdata(90));
		System.out.println(test.delAdata(90));	}

}
