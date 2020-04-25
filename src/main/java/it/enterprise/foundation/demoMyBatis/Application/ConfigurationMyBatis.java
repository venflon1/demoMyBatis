package it.enterprise.foundation.demoMyBatis.Application;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConfigurationMyBatis {
	
	private static final String  MY_BATIS_XML_FILE_CONFIG = "mybatis-config.xml";
	private SqlSessionFactory sqlSessionFactory = null;
	
	public ConfigurationMyBatis() throws IOException {
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(MY_BATIS_XML_FILE_CONFIG));
	}


	public SqlSessionFactory getSqlSessionFactory() {
		return this.sqlSessionFactory;
	}
}
