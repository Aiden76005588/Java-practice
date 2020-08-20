
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		dao = new OracleMyBatisDAO();

	}

	public int deptRecordCount() {

		return 0;

	}

//	public void delete(int deptno) {
//		SqlSession session= MySqlSessionFactory.getSqlSession();
//		Connection con =null;
//		int num;
//		try {// con닫기
//			
//			dao.delete(con, i);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//
//		}
//
//	}
//	public List<Dept> selectByDeptNameAndLoc(Dept dept) {
		//1.dao에서 부서이름, 지역을 이용 and select 완성후 아래처럼 수정
		//dao에서 dept를 검사 부서 이름만 있는 경우
		//지역만있는 경우
		//둘다 있는 경우를 판단하여 Mapper.xml의 id를 다르게 호출하여
		//select 결과 리턴
//		SqlSession session= MySqlSessionFactory.getSqlSession();
//		List<Dept> list = null;

//		try {
//			dept = dao.selectByDeptNameAndLoc(session, dept);
//		}
//		finally {
//			session.close();
//		}		
//		return list;
//	}

	public void update(Dept dept) {

	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Dept dept = null;
		try {
			dept = dao.selectByDeptno(session, deptno);
		} finally {
			session.close();
		}
		return dept;
	}

	public void insert(Dept dept) {

	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}

}
