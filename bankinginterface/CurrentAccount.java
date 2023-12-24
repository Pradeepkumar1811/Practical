package com.bankinginterface;

public class CurrentAccount implements Accounts{
	int rateOfInterest=8;
	Bank customer;
	CurrentAccount(Bank user){
		this.customer=user;
	}
	@Override
	public void deposit(int amount) {
		System.out.println(amount+" deposited successfully");
		customer.currentBanlance+=amount;
	}

	@Override
	public void withdraw(int amount) {
		if(customer.currentBanlance-amount>=0) {
			System.out.println(amount+" withdrawn successfully");
			customer.currentBanlance-=amount;
		}
		else {
			System.err.println("Can't withdraw, amount is greater than your balance");
		}
	}

	@Override
	public void calculateInterest(int year) {
		int interest=(customer.currentBanlance*rateOfInterest*year)/100;
		System.out.println("Your interest for "+year+" year is "+interest);
	}

	@Override
	public int viewBalance() {
		return customer.currentBanlance;
	}

}
