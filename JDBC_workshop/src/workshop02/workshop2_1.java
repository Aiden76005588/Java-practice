package workshop02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class workshop2_1 {

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
          String sql = "select PDSUBNAME, pdcost, pdprice "+
          "from product "+
          "WHERE pdcost>(select min(pdcost) from product WHERE product.pdname='TV') "+
          "and pdcost < (SELECT MAX(pdcost)from PRODUCT where product.pdname='CELLPHONE') order by 2";
          pstmt = con.prepareStatement(sql);
          rs = pstmt.executeQuery();
          System.out.println("제품명"+"\t\t"+"제품원가"+"\t"+"제품가격");
          while(rs.next()){ 
        	  String pdSubName = rs.getString("PDSUBNAME");
        	  int pdCost =rs.getInt("PDCOST");
        	  int pdPrice = rs.getInt("PDPRICE");
        	  System.out.println(pdSubName+"\t"+pdCost+"\t"+pdPrice);
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
