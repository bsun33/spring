package com.bs.spring.d1.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("d1/scope.xml");
		Emp emp1 = ac.getBean("emp", Emp.class);
		Emp emp2 = ac.getBean("emp", Emp.class);

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
	}
	
}
