package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd = "test";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int num = 0;
		try {
			
			con =DriverManager.getConnection(url,userid,passwd);
			String sql = "insert into dept (deptno, dname, loc) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno);
			
		}
	}

}
