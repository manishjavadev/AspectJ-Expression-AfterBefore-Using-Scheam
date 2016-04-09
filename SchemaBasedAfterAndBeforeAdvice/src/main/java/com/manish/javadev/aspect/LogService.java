package com.manish.javadev.aspect;

import org.aspectj.lang.JoinPoint;

public class LogService {

	public void logBefore(JoinPoint joinPoint) {

		System.out.println("LogBefore() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName()
				+ " Processsing Loging stuff");
		System.out.println("======================");
	}

	public void logAfter(JoinPoint joinPoint) {

		System.out.println("LogAfter() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName()
				+ " Processsing Loging stuff after finishing method");
		System.out.println("======================");
	}

	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("LogAfterReturning() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("======================");

	}

	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("LogAfterThrowing() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("======================");

	}

}