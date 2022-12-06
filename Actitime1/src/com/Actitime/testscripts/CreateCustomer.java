package com.Actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Actitime.testscripts.ListenerImplementation.class)
public class CreateCustomer {
	
	@Test
	public void createCustomer() {
		Reporter.log("customer created",true);
		Assert.fail();
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("customer modified",true);
		Assert.fail();
	}

}
