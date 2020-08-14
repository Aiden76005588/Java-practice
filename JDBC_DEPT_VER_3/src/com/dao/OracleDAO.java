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

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	//Connection con = null;  //인스턴스 변수: 공유가능ㅅ
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
	//로컬변수: thread-safe	
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
	public void update() {}
	public void delete() {}

	public void insert(Dept xx) {
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql="insert into dept (deptno,dname,loc)"
					+ " values (?,?,? )";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setString(2,xx.getDname());
			 pstmt.setString(3,xx.getLoc());
			 pstmt.setInt(1, xx.getDeptno());
			 
			//6. 실행해서 결과받기
			 int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//7. 자원반납
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end insert

	public void update(Dept xx)throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql="update dept set "
					+ " dname=? , loc=?  where deptno=?";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setString(1,xx.getDname());
			 pstmt.setString(2,xx.getLoc());
			 pstmt.setInt(3, xx.getDeptno());
			 
			//6. 실행해서 결과받기
			 int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
			
		//사용자 예외처리
		if(num==0) {
			throw
	new RecordNotFoundException( xx.getDeptno()+" 레코드없다.");
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//7. 자원반납
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end upate

	public void delete(int i) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql="delete from dept where deptno=?"; 
			 pstmt = con.prepareStatement(sql);

			 pstmt.setInt(1, i);
			 
			//6. 실행해서 결과받기
			 int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//7. 자원반납
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) {
		//누적용
				ArrayList<Dept> list = new ArrayList<Dept>();
			//로컬변수: thread-safe	
				Connection con = null;
				PreparedStatement pstmt =null;
				ResultSet rs =null;
//				System.out.println(map.get("dname"));
//				System.out.println(map.get("loc"));
				try {
					con = DriverManager.getConnection(url, userid, passwd);
					String sql="select deptno x,dname, loc from dept where dname=? and loc=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, map.get("dname"));
					pstmt.setString(2, map.get("loc"));
					
					rs = pstmt.executeQuery();
					while(rs.next()) {
						int deptno = rs.getInt("x");
						String dname = rs.getString(2);
						String loc = rs.getString("loc");
						Dept dto = new Dept(deptno, dname, loc);
						//System.out.println(dto);
						list.add(dto);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(rs!=null)
						try {
							if(rs!=null)rs.close();
							if(pstmt!=null)pstmt.close();
							if(con!=null)con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
				
			
				
				return list;

	}
	
}



