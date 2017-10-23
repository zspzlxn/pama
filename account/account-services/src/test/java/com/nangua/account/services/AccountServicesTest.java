package com.nangua.account.services;

import junit.framework.Assert;

import org.junit.Test;

public class AccountServicesTest {

	@Test
	public void TestAdd(){
		Assert.assertEquals(new AccountServices().add(1, 2), 3);
	}
}
