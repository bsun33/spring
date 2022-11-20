package com.bs.spring.d2.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao {

	@Override
	public void addUser() {
		System.out.println("UserDaoMybatisImpl:添加成功");
	}

	public UserDaoMybatisImpl() {System.out.println("UserDaoMybatisImpl constructor");}
}
