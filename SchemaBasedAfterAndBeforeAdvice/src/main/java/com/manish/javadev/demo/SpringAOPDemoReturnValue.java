package com.manish.javadev.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.exception.AccountNotFoundException;
import com.manish.javadev.services.AccountService;

public class SpringAOPDemoReturnValue {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"Spring-Context.xml");

		AccountService accountService = (AccountService) appContext
				.getBean("asTarget");

		try {
			accountService.findAccountById(2);
		} catch (AccountNotFoundException exp) {
			System.out.println("AccountNotFoundException occoured");
		}
		
	}
}