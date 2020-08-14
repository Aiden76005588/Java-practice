package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";	
	public OracleDAO() {
		//드라이버 로딩
	}//end OracleDAO	
	public ArrayList<Dept> select()throws SQLException {
	
		return list;
	}//end select
	public void insert(Dept dept) {}//dept받아와서 insert후 갯수 출력
	public void update(Dept dept)throws RecordNotFoundException {}
	//update가 없을 시에 RecordNotFoundException(사용자 정의 ex발생)
	//업데이트할 자료가 없습니다. 메세지 출력 
	public void delete(int deptno)throws RecordNotFoundException  {}
	//RecordNotFoundException(사용자 정의 ex발생)삭제할 자료가 없습니다. 메세지 출력 
	public ? selectByDeptNo(int deptno) throws RecordNotFoundException{}
	//deptno 로 레코드 검색 메인에서 해당 자료의 이름, 부서번호, 지역 출력
	//검색된 내용이 없으면 "검색한 자료가 없습니다." Ex 발생
	public ArrayList<Dept> selectByNameLoc(HashMap map)
		throws RecordNotFoundException{}
	//메인에서 map에 키 "name"-"영업", "loc"-"제주"로 넘김 
	//value 만 꺼내서 And select, 결과를 ArrayList에 담아서 리턴 
	//레코드가 없는 경우 "검색한 자료가 없습니다." Ex 발생
	
}



