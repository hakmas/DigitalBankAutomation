package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.DepositPage;
import com.digitalbanking.pages.HomePage;


public class DepositPageTest extends BaseTest{
	HomePage homePage;
	DepositPage depositPage;
	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
		depositPage= homePage.goToDepositAccount();
		
	}
	@Test
	public void doDepositTest() throws Exception {
		depositPage.doDeposit();
		Thread.sleep(2000);
		
	}
	

}
