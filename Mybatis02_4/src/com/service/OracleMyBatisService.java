package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();

	}
	public List selectByDeptNameAndLoc(Dept dept) {
		//1.dao에서 부서이름, 지역을 이용 and select 완성후 아래처럼 수정
		//dao에서 dept를 검사 부서 이름만 있는 경우
		//지역만있는 경우
		//둘다 있는 경우를 판단하여 Mapper.xml의 id를 다르게 호출하여
		//select 결과 리턴
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List list = null;
		try {
			dept = dao.selectByDeptNameAndLoc(session, dept);
		}finally {
			session.close();
		}		
		return list;
	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		Dept dept=null;
		try {
		 dept=	dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;
	}
	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();//명시적으로 꼭 해주어야 함. 
		} finally {
			session.close();
		}
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}
//	public ArrayList<Dept> select() throws SQLException{
//	
//		ArrayList<Dept> list= null;
//		try {//con닫기
//		 con= DriverManager.getConnection(url, userid, passwd);
//		 list = dao.select();		 
//		}finally {
//		
//		}
//		return list;
//	}
//	public void insert(Dept xx) {
//	
//	
//		try {//con닫기
//	
//			 dao.insert( xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		
//		}		
//	 }
//	public void update(Dept xx) throws RecordNotFoundException {
//		Connection con= null;
//	
//		try {//con닫기
//	
//			 dao.update(con, xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			
//		}		
//	 }
//	public void delete(int i)  {
//	
//		
//		try {//con닫기
//
//			dao.delete(con, i);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//
//		}		
//	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		
	}

}
