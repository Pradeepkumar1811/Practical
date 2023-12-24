package com.bankinginterface;
import java.util.*;
public class User {
	static Bank customer;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Bank>users=new ArrayList<Bank>();
		users.add(new Bank("3632173",1968,50000,100000));
		users.add(new Bank("3433907",1817,100000,200000));
		users.add(new Bank("3547158",1573,150000,230000));
		users.add(new Bank("5610789",1980,200000,5000));
		int userOpt=1;
		while(userOpt==1) {
			System.out.println("Enter 1 to continue");
			System.out.println("Enter 2 to exit");
			userOpt=input.nextInt();
			if(userOpt==2) {
				System.err.print("Terminating....");
				System.exit(0);
			}
			else if(userOpt!=1) {
				System.err.println("***Enter valid option***");
				userOpt=1;
				continue;
			}
			System.out.print("Enter ATM card number:");
			String card=input.next();
			System.out.print("Enter 4 digit pin:");
			int pin=input.nextInt();
			boolean isUser=false;
			for(Bank user:users) {
				if(user.cardNo.equals(card) && pin==user.pin) {
					customer=user;
					isUser=true;
					break;
				}
			}
			if(!isUser) {
				System.err.println("Invalid card number or pin");
				break;
			}
			System.out.println("Enter 1 to get in SavingAccount");
			System.out.println("Enter 2 to get in CurrentAccount");
			int accountOpt=input.nextInt();
			if(accountOpt==1) {
				System.out.println("Enter 1 to withdraw");
				System.out.println("Enter 2 to deposit");
				System.out.println("Enter 3 to viewbalance");
				System.out.println("Enter 4 to calculate interest");
				int option=input.nextInt();
				Accounts account=new SavingAccount(customer);
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
				else if(option==3) {
					System.out.println("Your balance is "+account.viewBalance());
				}
				else if(option==4) {
					System.out.println("Enter no of years for interest:");
					int year=input.nextInt();
					account.calculateInterest(year);
				}
				else{
					System.err.println("***Enter valid option***");
				}
			}
			else if(accountOpt==2) {
				System.out.println("Enter 1 to withdraw");
				System.out.println("Enter 2 to deposit");
				System.out.println("Enter 3 to viewbalance");
				System.out.println("Enter 4 to calculate interest");
				int option=input.nextInt();
				Accounts account=new CurrentAccount(customer);
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
				else if(option==3) {
					System.out.println("Your balance is "+account.viewBalance());
				}
				else if(option==4) {
					System.out.println("Enter no of years for interest:");
					int year=input.nextInt();
					account.calculateInterest(year);
				}
				else{
					System.err.println("***Enter valid option***");
				}
				
			}
			else{
				System.err.println("***Enter valid option***");
			}
		}
	}

}
