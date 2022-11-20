package com.bs.spring.d2.ioc.datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("d2/datasource.xml");
		DruidDataSource bean = ac.getBean("datasource", DruidDataSource.class);
		System.out.println(bean.getConnection());
		
		
	}
	
}
