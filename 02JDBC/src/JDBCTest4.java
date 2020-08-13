import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest4 {
	    String driver="oracle.jdbc.driver.OracleDriver";//6_g.
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid ="scott";
		String passwd = "tiger"; 		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		
		
		public JDBCTest4() {
			//드라이버 로딩
			try{
				Class.forName(driver);
				System.out.println("로딩성공");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		public String getDeptAdata(int deptno) {
			//deptno를 select하기위한 sql문 작성
			//한부서의 정보를 string으로 리턴
			String data = null;
			try {
			String sql ="select * from dept where deptno=?";
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			}catch
			return rs.getString(sql);
		}
		public int delAdata(int deptno) {
			//부서번호를 가지고 부서 삭제 후 처리한 레코드 갯수 리턴
			String sql2 ="delete from dept where dname=?";			
			pstmt.setInt(1,deptno);
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:"+num);	
			
			return num;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력
		
			
	}

}
