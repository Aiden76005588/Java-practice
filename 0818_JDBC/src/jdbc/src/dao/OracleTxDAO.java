package jdbc.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.src.dto.Dept;
import jdbc.src.exception.RecordNotFoundException;

public class OracleTxDAO {
	public void update(Connection con, Dept xx) throws RecordNotFoundException  {
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set " + " dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);

			if (num == 0) {
//				throw new RecordNotFoundException(xx.getDeptno() + " 레코드 없다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// end upate

	public void delete(Connection con,int i) {
		PreparedStatement pstmt = null;
		try {
		String sql = "delet from dept where deptno=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, i);
		
		int num = pstmt.executeUpdate();
		System.out.println("실행된 레코드 갯수:"+num);
		} catch(SQLException e) {
			try {
				System.out.println("서비스 롤백");
				con.rollback();//이곳에서 롤백
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
			
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert(Connection con, Dept xx) {
		PreparedStatement pstmt = null;
		try {
		String sql = "insert into dept (deptno, dname, loc)" + " values (?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, xx.getDeptno());
		pstmt.setString(2, xx.getDname());
		pstmt.setString(3, xx.getLoc());
		
		int num = pstmt.executeUpdate();
		System.out.println("실행된 레코드 갯수"+num);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}// end insert

	public ArrayList<Dept> select(Connection con) throws SQLException {
		// conn 사용
		// 사용 후 rs, pstmt만 closes
		ArrayList<Dept> list = new ArrayList<Dept>();//누적용
		//로컬변수: thread-safe
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql ="select deptno x,dname,loc from dept";
		pstmt= con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname =  rs.getString(2);
			String loc =  rs.getString("loc");
			Dept dto = new Dept(deptno, dname, loc);
			list.add(dto);
		}
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		
		return list;

	}// end select
}
