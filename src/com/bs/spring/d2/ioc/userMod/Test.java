package com.bs.spring.d2.ioc.userMod;

import com.bs.spring.d2.ioc.userMod.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("d2/user.xml");
		UserController uc = ac.getBean("aaa", UserController.class);
		/*System.out.println(uc);
		UserService us = ac.getBean("userServiceImpl",UserServiceImpl.class);
		System.out.println(us);
		UserDao ud = ac.getBean("userDaoImpl",UserDaoImpl.class);
		System.out.println(ud);*/
		uc.addUser();
		
	}
	
}
