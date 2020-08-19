package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list=  session.selectList("selectAll");//sqlsession 객체의 결과가 여러개인 select문 실행시 selectList 함수 사용
		//DeptMapper.xml의 id가 selectAll인 sql을 수행
		return list;
	}

}
