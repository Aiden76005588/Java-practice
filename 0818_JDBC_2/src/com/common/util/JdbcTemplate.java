
package com.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {// 드라이버 로딩 및 db 연결, con 리턴, con.close();

	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static String userid = "scott";
	public static String passwd = "tiger";

	public JdbcTemplate() { // 드라이버로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Connection을 연결한 후 멤버 attribute 인 conn 에 Connection 객체를 세팅한 후 리턴한다.
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		// db연결 , 연결된 connection 리턴
		// connect연결 후 tx를 false로 설정 리턴 con.setAutoCommit(false);
		Connection conn = null;
		try {

			conn = DriverManager.getConnection(url, userid, passwd);

		} catch (Exception e) {
			System.out.println("[JdbcTemplate.getConnection] : " + e.getMessage());
			e.printStackTrace();

		}

		return conn;// connection 리턴
	}

	/**
	 * DB와 Connect되었는지 여부를 Return 한다.
	 * 
	 * @return DB와 Connect 되었는지 여부.
	 */
	public static boolean isConnected(Connection conn) {		
		boolean validConnection = true;
		try {
			boolean vaildConnection;
			if (conn ==null || conn.isClosed())
				vaildConnection = false;
		}catch(SQLException e) {
			validConnection = false;
			e.printStackTrace();
		}
//conn 이 null 이거나   conn.isClose()가 참이면  validConnection을 false 로 설정 
		return validConnection;
	}

	/**
	 * Connection 객체를 시스템에 반환한다.
	 */
	public static void close(Connection conn) {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		if(isConnected(conn)) {
//			try {
//				conn.close();
//				}catch (SQLException e){
//					e.printStackTrace();
//				}
//		}

		// conn !== null인 경우 close
	}

	/**
	 * Statement를 Close 한다.
	 * 
	 * @param stmt Statement 객체.
	 */
	public static void close(PreparedStatement stmt) {
		PreparedStatement pstmt =null;
		// dao 에서 pstmt를 넘겨줘서 PreparedStatement를 close()//try-catch처리
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ResultSet을 Close 한다.
	 * 
	 * @param result ResultSet 객체.
	 */
	public static void close(ResultSet rset) {
		ResultSet rset1 = null;
		// rset close-try-catch 처리
		try {
			if(rset1 != null) 
				rset1.close();
			}catch(SQLException e) {
				e.printStackTrace();
		}
	}

	/**
	 * 지금까지의 트랜잭션을 Commit 처리한다.
	 */
	public static void commit(Connection conn) {

		try {
			if (isConnected(conn)) {
				conn.commit();
				System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 지금까지의 트랜잭션을 Rollback 처한다.
	 */
	public static void rollback(Connection conn) {

		try {
			if (isConnected(conn)) {
				conn.rollback();
				System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
