package com.shopsys.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtis {
	private static SqlSessionFactory sqlSessionFactory = null;

	public static SqlSession createSqlSession() {
		SqlSession session = null;
		if (sqlSessionFactory == null) {
			String resource = "config/MybatisConfig.xml";
			Reader reader;
			SqlSessionFactory sqlSessionFactory = null;
			
			try {
				reader = Resources.getResourceAsReader(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				session = sqlSessionFactory.openSession();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else{
			session = sqlSessionFactory.openSession();
		}
		return session;
	}
}
