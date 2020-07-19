package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.LoginPage;

public class LoginTest extends BaseTest{
//	LoginPage loginPage;
	@Test
	public void loginAUserTest() throws Exception {
		Thread.sleep(5000);
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(3000);
		
	}

}
