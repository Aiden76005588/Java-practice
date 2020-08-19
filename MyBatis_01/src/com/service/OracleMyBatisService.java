package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao= new OracleMybatisDAO();
	}
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();//모든 함수마다 얻기
		//SqlSession 얻어오기(connection과 비슷)
		List<Dept> list =null;// Dept 객체들을 가지는 List 객체를 저장하고 반환할수 변수 선언
		try {
			list = dao.selectAll(session);//dao에 sqlsession 전송
		}finally {
			session.close();//connection.close()와 비슷, 모든 함수 마다 닫기.
		}
		return list;
	}// end class


}
