package workshop02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/*
<사용 Query>
SELECT	PDSUBNAME, PDCOST, PDPRICE
FROM	PRODUCT 
WHERE	PDCOST > ANY 
                 (SELECT  PDCOST
                  FROM    PRODUCT 
                  WHERE   PDNAME = 'TV')
AND	PDCOST < ANY
                 (SELECT  PDCOST
                  FROM    PRODUCT 
                  WHERE   PDNAME = 'CELLPHONE')
ORDER BY 2
 * */

public class JDBCTest2 {
    public static void main(String [] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "tester";
        String pass = "tester";
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
              
            String query = "SELECT  PDSUBNAME, PDCOST, PDPRICE " +
            		"FROM     PRODUCT " +            	
					"WHERE    PDCOST > (SELECT min(PDCOST) FROM PRODUCT WHERE PDNAME = 'TV' )" +
            		"AND      PDCOST < (SELECT max(PDCOST) FROM PRODUCT WHERE PDNAME = 'CELLPHONE') " +
            		"ORDER BY 2";
            
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            System.out.println("제품명 \t\t 제품원가 \t\t 제품가격");
            System.out.println("--------------------------------------------------------");
            
            while(rs.next()) {
                String pdSubName = rs.getString("PDSUBNAME");
                int pdCost = rs.getInt("PDCOST");
                int pdPrice = rs.getInt("PDPRICE");
                
                System.out.println(pdSubName + " \t " + pdCost + " \t " + pdPrice);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            
        } finally {
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
