import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	public JDBC_Method_divide_Test() {
		try {
			Class.forName(driver);
			System.out.println("로딩성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}		 
	
	public String getdeptAdata(int deptno) {
		String data=null;		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql= "select * from dept where deptno=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs= pstmt.executeQuery();
			data=null;
			while(rs.next()) {
				int deptno1= rs.getInt(1);
				String dname= rs.getString(2);
				String loc= rs.getString(2);
				data= deptno1+ "\t"+ dname+ "\t"+ loc;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		return data;
	}
	public int delAdata(int deptno) {
		int num=0;
		try {	
			con = DriverManager.getConnection(url, userid, passwd);
			String sql= "delete from dept where deptno=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			 num= pstmt.executeUpdate();		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return num;	
	}
	public static void main(String[] args) {
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
		System.out.println(test.getdeptAdata(90));
		System.out.println(test.delAdata(90));
		

	}

}
