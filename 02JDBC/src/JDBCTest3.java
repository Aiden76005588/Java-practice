import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {

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
			String sql = "insert into dept(deptno,dname,loc)"
			+"values(?,?,?)"; //  첫번째 물음표에 12를 넣는다.pstmt.setInt(1, 12);
			pstmt = con.prepareStatement(sql);			
			pstmt.setInt(1, 90);//?에 실제 데이터 설정
			pstmt.setString(2, "영업");
			pstmt.setString(3, "제주");
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:"+num);
			
//			int deptno = 80;
//			String dname = "영업"
//			
//			
//			String sql3="update dept set dname='"+dename+"'"+
//			
			String sql2 = "select deptno , dname,loc from dept where dname = '개발' ,'영업'";
			pstmt = con.prepareStatement(sql2);
			rs = pstmt.executeQuery(sql2);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname =rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
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
