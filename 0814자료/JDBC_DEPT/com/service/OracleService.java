package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

	OracleDAO dao;

	public OracleService() {
		//dao생성
	}
	public void insert(Dept dept) {}//메인에서 호출->dao.insert호출
	public ArrayList<Dept> select()throws SQLException {
	//Dao의 select함수 호출  실제 데이터 받아오기 	
	
	
		return list;
	}
	
}
