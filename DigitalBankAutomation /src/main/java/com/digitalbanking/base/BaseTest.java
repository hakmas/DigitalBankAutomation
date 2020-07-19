package com.digitalbanking.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.digitalbanking.pages.LoginPage;



public class BaseTest {
	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
