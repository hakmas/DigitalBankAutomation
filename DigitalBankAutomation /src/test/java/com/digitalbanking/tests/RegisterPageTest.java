package com.digitalbanking.tests;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.digitalbanking.base.BaseTest;
import com.digitalbanking.pages.HomePage;
import com.digitalbanking.pages.RegisterPage;
import com.digitalbanking.utils.ExcelUtil;


public class RegisterPageTest extends BaseTest{
	RegisterPage registerPage;
	@BeforeClass
	public void setHomePage() {
		registerPage = new RegisterPage(driver);
//		loginPage.loginAUser(prop.getProperty("userName"), prop.getProperty("password"));
		
	}
	@Test(dataProvider="getUserData")
	public void registerNewUserTest(String title, String fName, String lName, String gender, String dob,
			String ssn, String email, String password, String address, String locality, String region, String postCode, String country,
			String home, String mobile, String work) throws Exception {
		registerPage.registerNewUser(title, fName, lName, gender, dob, ssn, email, password, address, locality, region, postCode, country, home, mobile, work);
		Thread.sleep(2000);
	}
	@DataProvider
	public Object[][] getUserData() throws Exception{
		Object data[][] = ExcelUtil.getTestData("Sheet1");
		return data;
	}
	

}
