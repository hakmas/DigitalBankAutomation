package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.WithdrawPage;

public class WithdrawPageTest extends BaseTest{
	HomePage homePage;
	WithdrawPage withdrawPage;
	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
		withdrawPage= homePage.goToWitdrawAccount();
		
	}
	@Test
	public void transferMoneyTest() throws Exception {
		withdrawPage.witdrawMoney();
		Thread.sleep(2000);
		
	}

	

}
