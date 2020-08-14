package JDBC_divide_test_DTO2;



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

	public ArrayList<DeptDTO> getAllDept() {	
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept ";
			pstmt = con.prepareStatement(sql);			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDTO dept= new DeptDTO();
				dept.setDeptno( rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				list.add(dept);
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
		return list;
	}
	
	public ArrayList<DeptDTO> search(String loc, String dname) {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			if (loc != null && dname != null) {
				sql = sql + "loc =? and dname=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
				pstmt.setString(2, dname);
			}
			if (loc != null && dname == null) {
				sql = sql + "loc =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, loc);
			}
			if (dname != null && loc == null) {
				sql = sql + "dname =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dname);
			}
			if (dname == null && loc == null) {
				sql="select * from dept";
				pstmt = con.prepareStatement(sql);				
			}
			rs = pstmt.executeQuery();
		
			while (rs.next()) {				
				DeptDTO dept= new DeptDTO( rs.getInt(1),rs.getString(2), rs.getString(3));
				list.add(dept);
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
	
		return list;
	}

	public ArrayList<DeptDTO> searchDeptByName(String dname) {
//		public ArrayList<String> searchDeptByName(String dname) {
		
		ArrayList<DeptDTO> list= new ArrayList<DeptDTO>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			sql = sql + "dname =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dname);			
			rs = pstmt.executeQuery();			
			while (rs.next()) {		
				DeptDTO dept= new DeptDTO( rs.getInt(1),rs.getString(2), rs.getString(3));
				list.add(dept);			
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
			return list;
	}

	public int updateDept(DeptDTO dept) {
		int num=0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "update set dept dname=?, loc=? where deptno=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dept.getDname());
				pstmt.setString(2, dept.getLoc());
				pstmt.setInt(3, dept.getDeptno());
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

	public int insertDept(DeptDTO dept) {
		int num=0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "insert into dept (deptno, dname, loc) values (?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, dept.getDeptno());
				pstmt.setString(2, dept.getDname());
				pstmt.setString(3, dept.getLoc());
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

	public DeptDTO getdeptAdata(int deptno) {
		 DeptDTO dept=null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);			
			String sql = "select * from dept where   ";
			sql = sql + "deptno =? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, deptno);			
				rs = pstmt.executeQuery();
			while (rs.next()) {
				 dept= new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
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
	
		return dept;
	}
	public static void main(String[] args) {
		JDBC_Method_divide_Test test = new JDBC_Method_divide_Test();
		ArrayList<DeptDTO> list = test.getAllDept();
		for (DeptDTO x : list) {
			System.out.println(x.getDname());
		}
		
		// System.out.println(test.searchDeptByName("영업"));
	}

}
