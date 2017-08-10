package com.devopsdemo;

public class DemoBankAccount {

private double balance;
	
	public DemoBankAccount(double balance)   {
		 this.balance=balance;
	   }
	
	public double debit(double amount)   {
		
		if (balance < amount) {
		
		  	amount = balance;
		}
		
			balance =amount;
			
			return amount;
	  			
	}
	
	/*
	public static void main(String[] args)  {
		
		DemoBankAccount db = new DemoBankAccount(100.00);
		double approvedDebit = db.debit(97);
		System.out.println("Approved Debit amount is =  : " + approvedDebit);
		
	}
	*/
}
