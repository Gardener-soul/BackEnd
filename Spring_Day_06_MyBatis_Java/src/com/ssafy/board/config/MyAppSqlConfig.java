package com.ssafy.board.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 세션을 가져온다.
public class MyAppSqlConfig {
	
	private static SqlSession session;
	// 여기에서 session이라는 것을 만들어보겠다.
	
	static {
		// MyBatis 설정 파일을 가져와!
		
		try {
			String resource = "config/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			
			SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(reader);
			// 공장 건설 완료
			
			// true 옵션을 주면 자동으로 커밋이 됨. 
			session = sqlSessionFactory.openSession(true);
			System.out.println("세션 생성 성공~");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("세션 생성 실패~");
		}  
		
	}
	
	public static SqlSession getSession() {
		return session;
	}
	
}
