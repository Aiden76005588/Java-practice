import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.driver.OracleDriver";//6_g.
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid ="scott";
		String passwd = "tiger"; 
		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
//			String sql = "insert into dept(deptno,dname,loc)"
//			+"values(?,?,?)"; //  첫번째 물음표에 12를 넣는다.pstmt.setInt(1, 12);
//			pstmt = con.prepareStatement(sql);			
//			pstmt.setInt(1, 12);//?에 실제 데이터 설정
//			pstmt.setString(2, "개발");
//			pstmt.setString(3, "서울");
//			int num = pstmt.executeUpdate();
//			System.out.println("실행된 레코드 갯수:"+num);	
//			String sql2 = "select deptno , dname,loc from dept";
//			pstmt = con.prepareStatement(sql2);
//			rs = pstmt.executeQuery(sql2);
//			String sql3 = "delete from dept where deptno=?";
//			pstmt = con.prepareStatement(sql3);
//			rs= pstmt.executeQuery(sql3);
//			String sql4="SELECT * FROM DEPT \r\n" + 
//					"WHERE DEPTNO BETWEEN 30 AND 100 \r\n" + 
//					"ORDER BY DEPTNO DESC"; 
//			String sql5 = "select dname,loc from dept where dname like 'A%' ";
//			String sql6= "insert into dept(deptno,dname,loc)"+"values(?,?,?)";
//			pstmt.setInt(1, 99);//?에 실제 데이터 설정
//			pstmt.setString(2, "개발");
//			pstmt.setString(3, "서울");
//			
			String sql8="update dept set loc=? where deptno=?";
			pstmt.setString(1, "제주");//?에 실제 데이터 설정
			pstmt.setInt(2, 99);
			
			pstmt = con.prepareStatement(sql8);
			rs= pstmt.executeQuery();
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:"+num);
			
			
			String sql7= "select deptno, loc from dept where deptno=?";// ?는 위치값 pstmt.setInt(위치,값);
			pstmt = con.prepareStatement(sql7);			
			pstmt.setInt(1,99);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
//				String dname =rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+loc);
//				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
					
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
			
	}

}
