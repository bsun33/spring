package com.bs.spring.d2.ioc.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("d2/life.xml");
		Person person = ac.getBean("person", Person.class);
		System.out.println(person);
		ac.close();
		
	}
	
}
