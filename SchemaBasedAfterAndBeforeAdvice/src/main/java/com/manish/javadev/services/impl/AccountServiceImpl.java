package com.manish.javadev.services.impl;

import com.manish.javadev.exception.AccountNotFoundException;
import com.manish.javadev.services.AccountService;

public class AccountServiceImpl implements AccountService {

	public void addAccount() {
		System.out.println("addAccount() is processing logic");
	}

	public String findAccountById(int accNumber)
			throws AccountNotFoundException {

		System.out.println("FindAccountById Is Going To Process Logic");

		if (accNumber == 1) {
			System.out
					.println("FindAccountById While Prcessing A Logic Exception Occoured");
			System.out.println("===========================");
			throw new AccountNotFoundException("Account Not Found");
		}

		System.out.println("FindAccountById Execution Logic Done");
		System.out.println("===========================");
		return "Manish Srivastava Java Developer";
	}
}