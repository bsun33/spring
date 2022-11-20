package com.bs.spring.d2.ioc.userMod.service;

import com.bs.spring.d2.ioc.userMod.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier(value="userDaoMybatisImpl")
	private UserDao userDao;
	
	/*@Autowired
	@Qualifier(value="userDaoMybatisImpl")  //这个注解作用于这个方法的参数
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	@Override
	public void addUser() {
		userDao.addUser();
	}
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl constructor");
	}
	
}
