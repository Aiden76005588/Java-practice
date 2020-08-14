package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {

		//0. oracle_jar파일 buildPath에추가
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";//접속 api 클래스
		String url="jdbc:oracle:thin:@localhost:1521:orcl";//접속 주소
		String userid ="scott";//사용자 이름
		String passwd = "tiger"; //사용자 비밀번호
		
		//2. 드라이버 생성
		Connection con =null;//db 접속정보를 저장할 객체
		//PreparedStatemaent pstmt = null;		
		Statement stmt = null;//SQL 쿼리를 실행할 객체/connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs=null;//SQL 쿼리 결과를 저장할 객체 sqL실행후 select결과를 저장하는 객체
		
		try {
			Class.forName(driver);//1.드라이버로딩
		//2. 오라클 연결( Connection 연결)
			con = DriverManager.getConnection(url,userid,passwd);//DB 접속 정보 저장
		//3. sql 작성
//			String sql = "select deptno x, dname, loc from dept"; //;제거주의
			String sql = "select deptno , dname, loc from dept"; //;제거주의
		//4. SQL 실행= Statement, PreparedStatement  두 객체를 주로 이용
			//connection에서 명령을 실행해줄 Statement객체 하나얻어옴
			//SQL 쿼리 요청 준비
			stmt=con.createStatement();		
		//5.Statement를 이용 실행 select-executeQuery(),DML-executeUpdate()
			//SQL 쿼리 요청 수행
			rs= stmt.executeQuery(sql);//Select 결과를 ResultSet으로 받음
			//6. 실행해서 결과받기
			//6.SQL 쿼리 결과 저장
			//쿼리 결과를 저장한 객체의 데이터 조회
			while(rs.next()) {//한 레코드의 자료를 컬럼으로 접근 출력
				//쿼리결과 데이터의 형이 있으면 TRUE 리턴 및 rs에 저장, 없으면 false 리턴
				int deptno = rs.getInt("deptno");//저장한 데이터의 deptno 컬럼조회
				String dname= rs.getString("dname");//저장한 데이터의 dname 컴럼조회
				String loc = rs.getString("loc");//저장한 데이터의 loc 컬럼조회
				System.out.println(deptno+"\t"+dname+"\t"+loc);//출력
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//SQL 객체 자원 반납
			try {
				//7. 자원반납 반대순서로 실행 
				//객체 자원 반환할때는 객체 생성의 역순으로 반환해야함
				//객체를 close 메서드를 사용해서 반환하지 않으면 메모리 누수 발행.
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	
		
	
		
				
	
	}// end main
}
// end class