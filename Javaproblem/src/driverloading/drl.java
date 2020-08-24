package driverloading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class drl {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
		try {
      	  Class.forName(driver);
          con = DriverManager.getConnection(url, userid, passwd);
          String sql = "select * from dept order by deptno desc";
          pstmt = con.prepareStatement(sql);
          rs = pstmt.executeQuery();
          System.out.println("부서번호\t 부서이름 \t\t지역");
          while(rs.next()){        	  
        	  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
          }
		}catch(SQLException e) {
    	e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}finally {
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
            
			} catch(Exception e) {
            e.printStackTrace();
			}
		}
	}

}
