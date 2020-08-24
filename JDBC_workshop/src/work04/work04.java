package work04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class work04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd = "test";
		
		Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
		try {
      	  Class.forName(driver);
          con = DriverManager.getConnection(url, userid, passwd);
          String sql = "insert into DISCARDED_PRODUCT (select PDNO, PDNAME,FACTNO,PDDATE,PDCOST,PDPRICE, PDAMOUNT, SYSDATA from PRODUCT "+
        		  		"where factno=(SELECT FACTNO FROM FACTORY WHERE FACLOC='CHANGWON')";
          pstmt = con.prepareStatement(sql);
          int count =pstmt.executeUpdate();
          
          while(rs.next()) {
        	  System.out.println();
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
		
		try {
	      	  Class.forName(driver);
	          con = DriverManager.getConnection(url, userid, passwd);
	          String sql = "delete from product where factno = (select factno from factory where facloc ='CHANWON')";
	          pstmt = con.prepareStatement(sql);
	          rs = pstmt.executeQuery();
	          while(rs.next()) {
	        	  
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
