package com.digitalbanking.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.NewSavingAccountPage;

public class NewSavingAccountPageTest extends BaseTest{
	HomePage homePage;
	NewSavingAccountPage newSavingPage;
	@BeforeClass
	public void setHomePage() {
		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		homePage = new HomePage(driver);
		newSavingPage= homePage.goToNewSavingAccount();
		
	}
	@Test
	public void openNewSavingAccountTest() throws Exception {
		newSavingPage.openNewSavingAccount();
		Thread.sleep(2000);
		
	}
	

}
