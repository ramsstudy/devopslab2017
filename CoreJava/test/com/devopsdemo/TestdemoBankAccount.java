package com.devopsdemo;
import com.devopsdemo.*;
import org.junit.Test;
import junit.framework.Assert;


public class TestdemoBankAccount {

	@SuppressWarnings("deprecation")
	@Test
	public void testdebitWithsufficientFunds() {
	DemoBankAccount account = new DemoBankAccount(10);
	double amount = account.debit(5);
	Assert.assertEquals(5.0, amount);
	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testdebitWithInsufficientFunds() {
		DemoBankAccount account = new DemoBankAccount(10);
		double amount = account.debit(16);
		Assert.assertEquals(10.0, amount);
	}

}
