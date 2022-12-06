package com.Actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thane {
	@Test(groups = "smoke")
	public void talaopali() {
		Reporter.log("visited talao",true);
	
	}
	
	@Test(groups = "smoke")
	public void makhmali() {
		Reporter.log("visited makhmali",true);
		
	}
	@Test(groups = "regression")
	public void upvan() {
		Reporter.log("visited upvan",true);
		
	}
	
	@Test(groups = {"regression","smoke"})
	public void editCustomer() {
		Reporter.log("edited customer",true);
		
	}
	

}
