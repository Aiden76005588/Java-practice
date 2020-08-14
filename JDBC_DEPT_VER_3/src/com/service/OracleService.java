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
		dao = new OracleDAO();
	}
	public ArrayList<Dept> select()throws SQLException {
		ArrayList<Dept> list = dao.select();
		return list;
	}
	public ArrayList<Dept> selectByNameLoc(HashMap<String,String> map)throws SQLException {
		ArrayList<Dept> list = dao.selectByNameLoc(map);
		return list;
	}
	public void insert(Dept xx) {
		// TODO Auto-generated method stub
		dao.insert(xx);		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void update(Dept xx2)throws RecordNotFoundException {
		// TODO Auto-generated method stub
		dao.update(xx2);
	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		dao.delete(i);
	}
	
}
