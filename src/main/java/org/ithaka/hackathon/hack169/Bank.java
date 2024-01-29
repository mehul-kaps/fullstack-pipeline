package org.ithaka.hackathon.hack169;

public class Bank {

	public void deposit(Integer ac, Double amount) {
		System.out.println("Deposited [" + amount + "] to account [" + ac + "]");
	}
	
	public void withdraw(Integer ac, Double amount) {
		if(amount < 50)
			System.out.println("Cannot without less than $50");
		else
			System.out.println("Withdrawn [" + amount + "] from account [" + ac + "]");
	}
}