package com.abstractclass;

public class CurrentAccount extends BankAccount {
	int balance=100000;
	@Override
	public void deposit(int amount) {
		System.out.println(amount+" deposited successfully to current account");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println(amount+" withdrawn successfully from current account");
	}
}
