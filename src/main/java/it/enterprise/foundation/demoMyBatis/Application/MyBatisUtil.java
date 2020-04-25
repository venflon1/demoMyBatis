package it.enterprise.foundation.demoMyBatis.Application;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisUtil {

	private static MyBatisUtil _instance = null;

	private static SqlSessionFactory sqlSessionFactory = null;
	
	private SqlSession session = null;

	static {
		ConfigurationMyBatis cfg = null;
		try {
			cfg = new ConfigurationMyBatis();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		if(cfg != null)
			MyBatisUtil.sqlSessionFactory =cfg.getSqlSessionFactory();
	}


	private MyBatisUtil() {
		super();
		if(MyBatisUtil._instance != null)
			MyBatisUtil._instance = this;
	}

	public static MyBatisUtil getInstance() {
		if (MyBatisUtil._instance != null)
			return MyBatisUtil._instance;
		return new MyBatisUtil();
	}

	public SqlSession openSession() {
		 this.session  = MyBatisUtil.sqlSessionFactory.openSession();
		 return this.session;
	}
	
	public void closeSession() {
		this.session.close();
	}
}
