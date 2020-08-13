package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest3 {

	public static void main(String[] args) {

		//0. oracle_jar파일 buildPath에추가
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";//6_g.
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid ="scott";
		String passwd = "tiger"; 
		
		Connection con = null;
		Statement stmt = null;
//		PreperedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,passwd);
			int deptno=13;
			String deptname="개발";
			String loc="서울";
			String sql="insert into dept(deptno,dname,loc)"+"values("+deptno+",'"+deptname+"','"+loc+"')";
			System.out.println(sql);
			
			stmt =con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("실행됭 레코드 갯수:"+result);
//			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
			String select ="select * from dept";
			
			rs = stmt.executeQuery(select); // hgh = "uuyuy"
			while(rs.next()) {
				
			}
			System.out.println();
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}// end main
}
// end class
