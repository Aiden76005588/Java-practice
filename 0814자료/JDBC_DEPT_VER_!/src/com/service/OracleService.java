package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

	OracleDAO dao= new OracleDAO();

	public OracleService() {
		// dao = new OracleDAO();
	}
	public ArrayList<Dept> select()throws SQLException {
		ArrayList<Dept> list = dao.select();
		return list;
	}
	
}
