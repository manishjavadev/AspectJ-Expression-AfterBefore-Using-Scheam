package com.manish.javadev.aspect;

import org.aspectj.lang.JoinPoint;

public class TransactionService {

	public void txnBigin(JoinPoint joinPoint) {

		System.out.println("TXN Bigen() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName()  +" Start Here");
		System.out.println("======================");
	}

	public void txnCommite(JoinPoint joinPoint) {

		System.out.println("TXN Commite() called!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName() +" Ended Here");
		System.out.println("======================");

	}

	public void txnAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("TXN AfterThrowing() Called!");
		System.out.println("TXN Got Roolback!");
		System.out.println("Method Name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("======================");

	}
}