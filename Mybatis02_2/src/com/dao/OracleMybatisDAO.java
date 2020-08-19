package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list=  session.selectList("selectAll");
		
		return list;
	}
	public List<Dept> selectByDeptno(SqlSession session){
		List<Dept> list = session.selectList("selectByDeptno");
		return list;
	}
//	public List<Dept> insertByDept(SqlSession session){
//		List<Dept> list = session.selectList("insertByDept");
//		return list;
//	}
	
	public Dept selectByDeptnoUse(SqlSession session, int deptno){
		System.out.println("select======="+deptno);
		Dept dept = session.selectOne("selectByDeptnoUse",deptno);		
		return dept;
	}

}
