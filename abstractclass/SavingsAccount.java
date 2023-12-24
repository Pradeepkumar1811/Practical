package com.abstractclass;

public class SavingsAccount extends BankAccount {
	@Override
	public void deposit(int amount) {
		System.out.println(amount+" deposited successfully to saving account");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println(amount+" withdrawn successfully from saving account");
	}
}
