package com.bs.spring.d2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {

	private MathImpl mathImpl; // 有接口的目标对象target
	
	public ProxyUtil(MathImpl mathImpl) {
		super();
		this.mathImpl = mathImpl;
	}
	public Object getProxy() {
		//获取当前类的类加载器，用来加载代理对象所属类
		ClassLoader loader = this.getClass().getClassLoader();
		
		// 获取目标对象实现的所有接口的Class,代理类会和目标类实现相同的接口，
		// 最终通过代理对象实现功能
		Class[] interfaces = mathImpl.getClass().getInterfaces();
		
		// 代理对象实现功能的方式
		//JDK动态代理要求必须有接口， cglib要求必须有父类（继承）
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) 
					throws Throwable {
				
				try {
					MyLogger.before(method.getName(), args);
					Object obj = method.invoke(mathImpl, args);
					System.out.println("calculation done");
					MyLogger.after(method.getName(), args);
					return obj;
				} catch (Exception e) {
					MyLogger.throwing();
					e.printStackTrace();
					
				} finally {
					System.out.println("哪儿都有我");
				}
				return null;
			}
		});
	}
	
}
