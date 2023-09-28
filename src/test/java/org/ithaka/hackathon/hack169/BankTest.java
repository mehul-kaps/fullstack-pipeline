package org.ithaka.hackathon.hack169;

import org.junit.jupiter.api.BeforeEach;

public class BankTest {

	Bank bank;

	@BeforeEach                                         
	void setUp() {
		bank = new Bank();
	}
	
	public void depositTest() {
		bank.deposit(123, 44.5);
		
	}
	
	public void withdraw() {
		bank.deposit(776, 963.5);
	}

}
