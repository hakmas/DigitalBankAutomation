package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.TransferMoneyPage;

public class TransferMoneyPageTest extends BaseTest{
	HomePage homePage;
	TransferMoneyPage transferMoneyPage;
	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
		transferMoneyPage= homePage.goToTransferBetweenAccounts();
		
	}
	@Test
	public void transferMoneyTest() throws Exception {
		transferMoneyPage.transferMoney();
		Thread.sleep(2000);
		
	}

}
