package com.bs.spring.d2.ioc.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("d2/auto.xml");
		Emp emp = ac.getBean("emp", Emp.class);
		System.out.println(emp);
		
	}
	
}
