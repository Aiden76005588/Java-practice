ackage workshop02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
<사용 Query>

INSERT INTO DISCARDED_PRODUCT
(SELECT	PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE, PDAMOUNT, SYSDATE
 FROM    PRODUCT
 WHERE   FACTNO= 
        (SELECT FACTNO
         FROM   FACTORY
         WHERE  FACLOC = 'CHANGWON')
);
 * */

public class JDBCTest3 {
    public static void main(String [] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "tester";
        String pass = "tester";
        
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);

        con.setAutoCommit(false);            

            
            String query = "INSERT INTO DISCARDED_PRODUCT " +
            		"(SELECT PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE, PDAMOUNT, SYSDATE " +
            		"FROM     PRODUCT " +
            		"WHERE    FACTNO = (SELECT FACTNO FROM FACTORY WHERE FACLOC = 'CHANGWON'))";
            pstmt = con.prepareStatement(query);
 
            int count = pstmt.executeUpdate();
            
            System.out.println(count + "개의 데이터가 정상적으로 INSERT 되었습니다.");
con.commit();

        } catch(Exception e) {
            e.printStackTrace();
            
try {
                con.rollback();
                
            } catch (SQLException se) {
                se.printStackTrace();
            }

        } finally {
            try{
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
                
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    }

}
