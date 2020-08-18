package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {
	public void update(Connection con,Dept xx)throws RecordNotFoundException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt =null;
		try {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end upate

	public void delete(Connection con,int i) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt =null;
		try {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void insert(Connection con,Dept xx) {
		PreparedStatement pstmt =null;
		try {

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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end insert
	
	
	
public ArrayList<Dept> select(Connection con)throws SQLException {
		
		//누적용
		ArrayList<Dept> list = new ArrayList<Dept>();
	//로컬변수: thread-safe	
		PreparedStatement pstmt =null;
		ResultSet rs =null;
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
		
		return list;
	}//end select
}
