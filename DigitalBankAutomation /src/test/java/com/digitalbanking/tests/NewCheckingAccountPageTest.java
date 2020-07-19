package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.NewCheckingAccountPage;

public class NewCheckingAccountPageTest extends BaseTest{
	HomePage homePage;
	NewCheckingAccountPage newCheckingPage;
	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
		newCheckingPage= homePage.goToNewCheckingAccount();
		
	}
	@Test
	public void openNewCheckingAccountPageTest() throws Exception {
		newCheckingPage.openNewCheckingAccount();
		Thread.sleep(2000);
		
	}

}
