package com.abstractclass;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int userInput=1;
		while(userInput==1) {
			System.out.println("Enter 1 to enter 2 to exit");
			userInput=input.nextInt();
			if(userInput==2) {
				System.out.print("Terminating...");
				System.exit(0);
			}
			System.out.println("Enter 1 to get in Saving account");
			System.out.println("Enter 2 to get in Current account");
			int accountOpt=input.nextInt();
			if(accountOpt==1) {
				System.out.println("Enter 1 to withdraw");
				System.out.println("Enter 2 to deposit");
				int option=input.nextInt();
				BankAccount account=new SavingsAccount();
				if(option==1) {
					System.out.println("Enter amount to withdraw");
					int amount=input.nextInt();
					account.withdraw(amount);
				}
				else if(option==2) {
					System.out.println("Enter amount to deposit");
					int amount=input.nextInt();
					account.deposit(amount);
				}
			}
			else if(accountOpt==2) {
				System.out.println("Enter 1 to withdraw");
				System.out.println("Enter 2 to deposit");
				int option=input.nextInt();
				BankAccount account=new CurrentAccount();
				if(option==1) {
					System.out.println("Enter amount to withdraw");
					int amount=input.nextInt();
					account.withdraw(amount);
				}
				else if(option==2) {
					System.out.println("Enter amount to deposit");
					int amount=input.nextInt();
					account.deposit(amount);
				}
			}
			else{
				System.out.println("Enter valid option");
			}
		}

	}

}
