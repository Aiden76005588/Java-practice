package jdbc.src.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.src.dao.OracleTxDAO;
import jdbc.src.dto.Dept;
import jdbc.src.exception.RecordNotFoundException;

public class OracleTxService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";

	OracleTxDAO dao;

	public OracleTxService() {
		// 드라이버 로딩
		// dao생성
		dao = new OracleTxDAO();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list= null;
		Connection con = null;
		// db연결
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// select호출 - conn을 인자로 넘김
			list = dao.select(con);					
		// connection close()
		// 메인으로 ArrayList<Dept> 리턴 메인에서 결과 출력
			
		}finally {			
			if(con !=null)
			 con.close();
		}
		return list;
	}// end select

	public void insert(Dept xx) {
		// db연결
		// insert 호출- connection을 인자로 넘김
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.insert(con, xx);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end insert

	public void update(Dept xx2) throws RecordNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con, xx2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void delete(int i) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}// end deletes
	
	public void insertDelete(Dept dept, int i)  {
		Connection con =null;
		try {
			con=DriverManager.getConnection(url,userid,passwd);
			//기본적으로 자동 commit됨 con.setAutoCommit(false)/con.setAutoCommit(true) true가 default임
			// insert와 delete를 하나의 tx으로 묶음 tx의 시작
			con.setAutoCommit(false);
			dao.insert(con, dept);
			dao.delete(con, i);
			con.commit();
			
//			dao.insert(con, dept);
//			dao.delete(con, i);
			
			//con.commit();// tx완료시 //문제발생시 con.rollback();
		}catch(SQLException e) {
			try {
				System.out.println("롤백");
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con!=null)
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
