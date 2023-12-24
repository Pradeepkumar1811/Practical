package com.exceptionodd;
import java.util.*;
public class OddIntegerException extends Exception{
	OddIntegerException(String msg){
		super(msg);
	}
	public static void main(String[] args) throws OddIntegerException{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		input.close();
		try {
			if(number%2!=0) {
				throw new OddIntegerException("is odd");
			}
			else {
				System.out.println(number+" is even");
			}
		}
		catch(Exception e) {
			System.err.println(number+" "+e);
			System.err.println(number+" "+e.getMessage());
			
		}
	}

}
