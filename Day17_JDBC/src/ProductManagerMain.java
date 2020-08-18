
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductManagerMain {

	public static void main(String[] args) throws SQLException {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "test";
        String pass = "test";
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
	
        try {
        	  Class.forName(driver);
              con = DriverManager.getConnection(url, user, pass);

        String sql = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("매출 조회 메뉴 - [ 매출 일자순  : 1, 상품별 매출순 : 2  ]: ");
        int menu = scan.nextInt();
        
        if(menu==1){
			sql=" SELECT TO_CHAR(ODATE, 'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출 "
					+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY ODATE ORDER BY 1";
		}else if(menu==2){
			sql="SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 "
					+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY PNAME ORDER BY 2 DESC";
		}
        
        pstmt = con.prepareStatement(sql);
        rs = pstmt.executeQuery();
		System.out.println("--------------------------------------");
		System.out.println(((menu==1)?"영업일":"상품명")+"\t\t\t매출");
		System.out.println("--------------------------------------");
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
		}
		System.out.println("--------------------------------------");
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
