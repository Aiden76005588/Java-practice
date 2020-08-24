package workshop02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/*<사용 Query>
SELECT	PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT
FROM 	PRODUCT 
JOIN FACTORY USING (FACTNO)
JOIN STORE USING (PDNO)
WHERE FACLOC = 'SEOUL' 
AND (STAMOUNT IS NULL OR STAMOUNT = 0);*/

public class JDBCTest1 {
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
            
            
            String query = "SELECT PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT " +
            		"FROM PRODUCT " +
            		"JOIN FACTORY USING (FACTNO) " +
            		"JOIN STORE USING (PDNO) " +
            		"WHERE FACLOC = 'SEOUL' AND (STAMOUNT IS NULL OR STAMOUNT = 0)";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            System.out.println("제품카테고리 \t 제품명 \t 공장명 \t 판매점명 \t 판매점제고수량");
            System.out.println("--------------------------------------------------------");
            
            while(rs.next()) {
                String pdName = rs.getString("PDNAME");
                String pdSubName = rs.getString("PDSUBNAME");
                String facName = rs.getString("FACNAME");
                String stoName = rs.getString("STONAME");
                int stAmount = rs.getInt("STAMOUNT");
                
                System.out.println(pdName + " \t " + pdSubName + " \t " + facName + " \t " + stoName + " \t " + stAmount);
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
