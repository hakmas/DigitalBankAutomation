package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.LoginPage;

public class HomePageTest extends BaseTest {
	HomePage homePage;


	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
	}

	@Test(priority = 1)
	public void verifyHomePageTest() {
		Assert.assertTrue(homePage.verifyHomePage(), "Home Page Link is not available");
	}

	@Test
	public void goToViewCheckingAccountTest() throws Exception {
		homePage.goToViewCheckingAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToNewCheckingAccountTest() throws Exception {
		homePage.goToNewCheckingAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToViewSavingAccountTest() throws Exception {
		homePage.goToViewSavingAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToNewSavingAccountTest() throws Exception {
		homePage.goToNewSavingAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToDepositAccountTest() throws Exception {
		homePage.goToDepositAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToWitdrawAccountTest() throws Exception {
		homePage.goToWitdrawAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToNewApplicationAccountTest() throws Exception {
		homePage.goToNewApplicationAccount();
		Thread.sleep(2000);
	}

	@Test
	public void goToTransferBetweenAccountsTest() throws Exception {
		homePage.goToTransferBetweenAccounts();
		Thread.sleep(2000);
	}

	@Test
	public void goToVisaTransferAccountTest() throws Exception {
		homePage.goToVisaTransferAccount();
		Thread.sleep(2000);
	}

}
