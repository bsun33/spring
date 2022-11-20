package com.bs.spring.d2.proxy;

import java.util.Arrays;

public class MyLogger {
	public static void before(String methodName, Object... args) {
		System.out.println("前: method [ " + methodName + " ] arguments [ "
				+ Arrays.toString(args) + " ]");
	}
	
	public static void after(String methodName, Object... args) {
		System.out.println("后: method [ " + methodName + " ] arguments [ "
				+ Arrays.toString(args) + " ]");
	}
	
	public static void throwing() {
		System.out.println("有异常");
	}
}
