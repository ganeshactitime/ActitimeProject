package com.Actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kalyan {
	@Test(groups = "smoke")
	public void hanumantekdi() {
		Reporter.log("not visited",true);
	
	}
	
	@Test(groups = "smoke")
	public void kalaTalao() {
		Reporter.log("not visited",true);
		
	}
	@Test(groups = "regression")
	public void ganeshGhat() {
		Reporter.log("not visited",true);
		
	}
	@Test(groups = {"regression","smoke"})
	public void editCustomer() {
		Reporter.log("edited customer",true);
		
	}

}
