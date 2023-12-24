package com.bankinginterface;

public class Bank {
	int savingBalance;
	int currentBanlance;
	String cardNo;
	int pin;
	Bank(String card,int pin,int sBalance,int cBalance){
		this.savingBalance=sBalance;
		this.cardNo=card;
		this.pin=pin;
		this.currentBanlance=cBalance;
	}
	public int getSavingBalance() {
		return this.savingBalance;
	}
	public int getCurrentBalance() {
		return this.currentBanlance;
	}
}
