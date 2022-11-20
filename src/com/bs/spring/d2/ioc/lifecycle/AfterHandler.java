package com.bs.spring.d2.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Person person = (Person) bean;
		System.out.println("------ before init -------");
		if(person.getSex().equals("男")) {
			person.setName("张无忌");
		}else {
			person.setName("赵敏");
		}
		return person;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("------- after init -------");
		return bean;
	}


}
