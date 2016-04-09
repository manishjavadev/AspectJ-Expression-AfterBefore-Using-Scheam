package com.manish.javadev.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.exception.AccountNotFoundException;
import com.manish.javadev.services.AccountService;

public class SpringAOPDemoThrowsException {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"Spring-Context.xml");

		AccountService accountService = (AccountService) appContext
				.getBean("asTarget");

		// If we pass 1 as argument then java code will throw exception
		try {
			accountService.findAccountById(1);
		} catch (AccountNotFoundException exp) {
			System.out.println("AccountNotFoundException occoured");
		}

	}
}