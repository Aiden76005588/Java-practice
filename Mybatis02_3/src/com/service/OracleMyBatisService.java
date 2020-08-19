package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO();		
	}
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}// end class
	
	public List<Dept> selectByDeptno(){
		SqlSession session = MySqlSessionFactory.getSession();				
		List<Dept> list=null;
		try {
			list = dao.selectByDeptno(session);
		}
		finally {
			session.close();
		}
		return list;
	}
	public void deptInsert() {
		SqlSession session = MySqlSessionFactory.getSession();
		
	}
	
//	public List<Dept> insertByDept(){
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<Dept> list = null;
//		try {
//			list = dao.insertByDept(session);
//		}finally {
//			session.close();
//		}
//		return list;
//	}
	public List<Dept> selectByDeptnoUse(){
		SqlSession session = MySqlSessionFactory.getSession();				
		List<Dept> list=null;
		try {
			list = dao.selectByDeptno(session);
		}
		finally {
			session.close();
		}
		return list;
	}
	


}
