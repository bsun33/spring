package com.bs.spring.d2.proxy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//1. 直接调用
//		MathI math = new MathImpl();
//		int result = math.div(1, 1);
//		System.out.println(result);
		
		//2.
		ProxyUtil proxy = new ProxyUtil(new MathImpl());
		MathI proxy2 = (MathI)proxy.getProxy();
		int i = proxy2.add(1, 2);
		System.out.println(i);

		System.out.println("-----");

		proxy2.div(1, 1);

	}
	
}
