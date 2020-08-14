package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	
	public OracleDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end OracleDAO
	
	public ArrayList<Dept> select()throws SQLException {
		
		//누적용
		ArrayList<Dept> list = new ArrayList<Dept>();
		
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		con = DriverManager.getConnection(url, userid, passwd);
		String sql="select deptno x,dname,loc from dept ";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString("loc");
			Dept dto = new Dept(deptno, dname, loc);
			list.add(dto);
		}
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(con!=null)con.close();
		
		return list;
	}//end select
	public void insert() {}
	public void update() {}
	public void delete() {}
	
}



