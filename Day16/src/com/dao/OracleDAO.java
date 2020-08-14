package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public OracleDAO() {
		// 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		// 전체 데이터 리턴 출력
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select* from dept ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}// end select

	public void insert(Dept dept) {
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update() {
	}

	public void delete() {
	}

	public void selectByDeptNo(int deptno) throws RecordNotFoundException {
		// deptno 로 레코드 검색 메인에서 해당 자료의 이름, 부서번호, 지역 출력
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select dname, deptno, loc from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//
//	public ArrayList<Dept> selectByNameLoc(HashMap map) throws RecordNotFoundException {
//
//		try
//
//		{
//			con = DriverManager.getConnection(url, userid, passwd);
//			String sql = "select dname, loc from dept  ";
//			
//
//		} catch (RecordNotFoundException e) {
//			e.printStackTrace();
//
//		}
//		return null;
//	}

}
