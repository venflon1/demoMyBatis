package it.enterprise.foundation.demoMyBatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.enterprise.foundation.demoMyBatis.Application.MyBatisUtil;
import it.enterprise.foundation.demoMyBatis.mappers.UserMapper;
import it.enterprise.foundation.demoMyBatis.model.User;

public class UserService {

	private MyBatisUtil myBatisUtil = MyBatisUtil.getInstance();

	public List<User> listUsers() {
		// open session
		SqlSession session = myBatisUtil.openSession();

		// retrieve mapper
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> listUser = userMapper.getAll();
		
		// commit
		session.commit();

		// close session
		myBatisUtil.closeSession();
		
		return listUser;
	}
}