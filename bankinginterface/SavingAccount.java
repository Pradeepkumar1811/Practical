package com.bankinginterface;

public class SavingAccount implements Accounts {
	int rateOfInterest=4;
	Bank customer;
	SavingAccount(Bank user){
		this.customer=user;
	}
	@Override
	public void deposit(int amount) {
		System.out.println(amount+" deposited successfully");
		customer.savingBalance+=amount;
	}

	@Override
	public void withdraw(int amount) {
		if(customer.savingBalance-amount>=0) {
			System.out.println(amount+" withdrawn successfully");
			customer.savingBalance-=amount;
		}
		else {
			System.err.println("Can't withdraw, amount is greater than your balance");
		}
	}

	@Override
	public void calculateInterest(int year) {
		int interest=(customer.savingBalance*rateOfInterest*year)/100;
		System.out.println("Your interest for "+year+" year is "+interest);
	}

	@Override
	public int viewBalance() {
		return customer.savingBalance;
	}

}
