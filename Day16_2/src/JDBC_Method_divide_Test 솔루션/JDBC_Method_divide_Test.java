import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public JDBC_Method_divide_Test() {
		// 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getAllDept() {
//		public ArrayList<String> getAllDept() {
	
		String result="";
		ArrayList<String> list = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept ";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result += rs.getInt(1);
				result += rs.getString(2);
				result += rs.getString(3);
				result += "\n";	
//				String addResult= "";
//				addResult += rs.getInt(1);
//				addResult += rs.getString(2);
//				addResult += rs.getString(3);				
//				list.add(addResult);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		return result;
//		return list;
	}
	
	// public ArrayList<String> search(String loc, String name){
	public String search(String loc, String name) {
		String result="";
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			if (loc != null && name != null) {
				sql = sql + "loc =? and dname=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
				pstmt.setString(2, name);
			}
			if (loc != null && name == null) {
				sql = sql + "loc =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
			}
			if (name != null && loc == null) {
				sql = sql + "dname =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
			}
			if (name == null && loc == null) {
				sql="select * from dept";
				pstmt = con.prepareStatement(sql);				
			}
			rs = pstmt.executeQuery();
		
			while (rs.next()) {
				result += rs.getInt(1);
				result += rs.getString(2);
				result += rs.getString(3);
				result += "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
		}
	
		return result;
	}

	public String searchDeptByName(String dname) {
//		public ArrayList<String> searchDeptByName(String dname) {
		String result="";
		ArrayList<String> list= new ArrayList<String>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			sql = sql + "dname =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dname);			
			rs = pstmt.executeQuery();			
			while (rs.next()) {				
				result += rs.getInt(1);
				result += rs.getString(2);
				result += rs.getString(3);
				result += "\n";
//				String addResult= "";
//				addResult += rs.getInt(1);
//				addResult += rs.getString(2);
//				addResult += rs.getString(3);				
//				list.add(addResult);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		return result;
//		return list;
	}

	public int updateDept(String dname, String loc, int deptno) {
		int num=0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "update set dept dname=?, loc=? where deptno=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dname);
				pstmt.setString(2, loc);
				pstmt.setInt(3, deptno);
				num= pstmt.executeUpdate();			
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		return num;
	}

	public int insertDept(String dname, String loc, int deptno) {
		int num=0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "insert into dept (deptno, dname, loc) values (?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, deptno);
				pstmt.setString(2, dname);
				pstmt.setString(3, loc);
				 num= pstmt.executeUpdate();			
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		return num;
	}

	public String getdeptAdata(int deptno) {
		String result="";
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			sql = sql + "deptno =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, deptno);			
				rs = pstmt.executeQuery();
			while (rs.next()) {
				result += rs.getInt(1);
				result += rs.getString(2);
				result += rs.getString(3);
				result += "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		return null;
	}

	public static void main(String[] args) {
		JDBC_Method_divide_Test test = new JDBC_Method_divide_Test();
//		ArrayList<String> list = test.searchDeptByName("영업");
//		for (String x : list) {
//			System.out.println(x);
//		}
		//System.out.println(test.search("제주", null));
		//System.out.println(test.search(null, "영업"));
		//System.out.println(test.search(null, "개발"));
		
		 System.out.println(test.searchDeptByName("영업"));
	}

}
