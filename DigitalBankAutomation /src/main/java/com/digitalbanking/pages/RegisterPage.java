package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class RegisterPage extends BasePage {
	private WebDriver driver;
	private ElementUtil elementUtil;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	// capture elements
	By signUpLink = By.xpath("//a[@href='/signup']");
	By successMes = By.xpath("//span[contains(.,'Registration Successful. Please Login.')]");
	By title = By.xpath("//select[@id='title']");
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By genderMale = By.xpath("//input[@value='M']");
	By genderFemale = By.xpath("//input[@value='F']");
	By dob = By.xpath("//input[@id='dob']");
	By ssn = By.xpath("//input[@id='ssn']");
	By email = By.xpath("//input[@id='emailAddress']");
	By password = By.xpath("//input[@id='password']");
	By confirmPassword = By.xpath("//input[@id='confirmPassword']");
	By nextBtn = By.xpath("//button[contains(.,'Next')]");
	By address = By.xpath("//input[@id='address']");
	By locality = By.xpath("//input[@id='locality']");
	By region = By.xpath("//input[@name='region']");
	By postalCode = By.xpath("//input[@id='postalCode']");
	By country = By.xpath("//input[@id='country']");
	By homePhone = By.xpath("//input[@id='homePhone']");
	By mobilePhone = By.xpath("//input[@id='mobilePhone']");
	By workPhone = By.xpath("//input[@id='workPhone']");
	By agreeBtn = By.xpath("//input[@id='agree-terms']");
	By registerBtn = By.xpath("//button[contains(.,'Register')]");

	public void registerNewUser(String title, String fName, String lName, String gender, String dob, String ssn,
			String email, String password, String address, String locality, String region, String postCode,
			String country, String home, String mobile, String work) {
		elementUtil.waitForElementToBeVisible(signUpLink, 10);
		elementUtil.doClick(signUpLink);
		elementUtil.doSendKeys(this.title, title);
		elementUtil.doSendKeys(firstName, fName);
		elementUtil.doSendKeys(lastName, lName);
		if (gender.equalsIgnoreCase("F")) {
			elementUtil.doClick(genderFemale);
		} else {
			elementUtil.doClick(genderMale);
		}
		elementUtil.doSendKeys(this.dob, dob);
		elementUtil.doSendKeys(this.ssn, ssn);
		elementUtil.doSendKeys(this.email, email);
		elementUtil.doSendKeys(this.password, password);
		elementUtil.doSendKeys(confirmPassword, password);
		elementUtil.doClick(nextBtn);
		elementUtil.doSendKeys(this.address, address);
		elementUtil.doSendKeys(this.locality, locality);
		elementUtil.doSendKeys(this.region, region);
		elementUtil.doSendKeys(postalCode, postCode);
		elementUtil.doSendKeys(this.country, country);
		elementUtil.doSendKeys(homePhone, home);
		elementUtil.doSendKeys(mobilePhone, mobile);
		elementUtil.doSendKeys(workPhone, work);
	}
	

}
