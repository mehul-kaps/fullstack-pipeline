package org.ithaka.hackathon.hack169;

public class Bank {

	public void deposit(Integer ac, Double amount) {
		System.out.println("Deposited [" + amount + "] to account [" + ac + "]");
	}
	
	public void withdraw(Integer ac, Double amount) {
		System.out.println("Withdrawn [" + amount + "] from account [" + ac + "]");
	}
}
