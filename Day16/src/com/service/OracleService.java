package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleService {

	OracleDAO dao;

	public OracleService() {
		// dao생성
		dao = new OracleDAO();// 데이터 접속
	}

	public void insert(Dept dept) {// 메인에서 호출=>dao.insert호출
		dao.insert(dept);
	}
//	public ArrayList<Dept> selectByNameLoc(HashMap<String,String> map) throws SQLException, RecordNotFoundException {
//		ArrayList<Dept> list = dao.selectByNameLoc(map);
//		
//		return list;
//	}
	public ArrayList<Dept> selectByNameLoc(HashMap<String,String> map) throws SQLException, RecordNotFoundException {
	ArrayList<Dept> list = dao.selectByNameLoc(map);
	
	return list;
}

	public ArrayList<Dept> select() throws SQLException {
		// Dao의 select함수 호출 실제 데이터 받아오기

		return dao.select();// ArrayList<Dept> select() 동일해서 가능
	}

}
