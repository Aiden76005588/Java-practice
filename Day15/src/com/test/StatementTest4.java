package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest4 {

	public static void main(String[] args) {

		//0. oracle_jar파일 buildPath에추가
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";//6_g.
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid ="scott";
		String passwd = "tiger"; 
		
		Connection con= null;
		Statement stmt = null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userid,passwd);
			String name="SALES";
			String sql = "select deptno, dname, loc from dept where dname='"+name+"'";
			stmt=con.createStatement();
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
				
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
				
	
	}// end main
}
// end class
