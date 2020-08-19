package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {//TemplateClass랑 동일
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		//static=static변수를 초기화 할때 사용
		String resource = "Configuration.xml";//경로 수정시 이것만 수정
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 sqlSessionFactory =//Connection을 얻어갈수 있는 클래스
		new SqlSessionFactoryBuilder().build(inputStream);
	}//end static
	
	//SqlSession 반환해주는 메서드
	// MySqlSessionFactory.getSession()
	public static SqlSession getSession() {//MySqlSessionFactory.getSession()으로 호출하여 사용
		SqlSession session = sqlSessionFactory.openSession();
		//실제 사용자가 사용할 connection과 비슷한 객체
		return session; //getSession을 이용해 db접속- main으로 리턴
	}
	
}//end class





