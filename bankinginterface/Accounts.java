package com.bankinginterface;

public interface Accounts {
	public void deposit(int amount);
	public void withdraw(int amout);
	public void calculateInterest(int year);
	public int viewBalance();
}
