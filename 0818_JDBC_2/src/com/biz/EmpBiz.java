package com.biz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;



public class EmpBiz {


	EmpDAO dao;

	public EmpBiz() {// service 클래스
		// dao생성
		
	}

	public ArrayList<EmpDTO> selectAllEmp() throws SQLException {
		// JdbcTemplate.getConnection()에서 con얻기
		// dao.selectAllEmp(con); 호출 conn 전달
		// dbcTemplate 이용 close(con) 으로 컨넥션 끊기
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list = dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		// db연결	
		

		return list;
	}
//	public ArrayList<EmpDTO> selectAllEmp(Connection con)  {	
//		ArrayList<EmpDTO> list = new ArrayList<>();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			String sql ="select empno, ename,job,mrg, to_char(hiredate,'YYYY-MM-DD')hiredate,"+"sal,comm,deptno from emp order by empno desc";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				int empno = rs.getInt("empno"); String ename = rs.getString("ename");
//				String job = rs.getString("job"); int mgr = rs.getInt("mgr");
//				String hiredate = rs.getString("hireate"); double sal = rs.getDouble("sal");
//				double comm =rs.getDouble("comm"); int deptno = rs.getInt("deptno");
//				EmpDTO notice = new EmpDTO(empno,ename,job,mgr,hiredate,sal,comm,deptno);
//				list.add(notice);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			JdbcTemplate.close(rs);
//			JdbcTemplate.close(pstmt);
//		}
//		return list;
//	}

	public EmpDTO selectDetailEmp(String eno) throws DataNotFoundException {
		// JdbcTemplate.getConnection()에서 con 얻기
		// dao.selectDetailEmp(con); 호출
		// dbcTemplate 이용 close
		Connection con = JdbcTemplate.getConnection();
		EmpDTO sss = dao.selectDetailEmp(con, eno);
		JdbcTemplate.close(con);
		
		return sss;
	}

	public void empUpdate(EmpDTO empDTO) throws DataNotFoundException {
		
	}

	public void empDelete(String empno) throws DataNotFoundException {
		
	}
}
