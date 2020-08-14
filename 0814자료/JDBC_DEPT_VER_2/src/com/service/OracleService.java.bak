package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

	OracleDAO dao= new OracleDAO();

	public OracleService() {
		 dao = new OracleDAO();
	}
	public void insert(Dept xx) {
		// TODO Auto-generated method stub
		dao.insert(xx);
	}
	public ArrayList<Dept> select()throws SQLException {
		ArrayList<Dept> list = dao.select();
		return list;
	}
	
}
