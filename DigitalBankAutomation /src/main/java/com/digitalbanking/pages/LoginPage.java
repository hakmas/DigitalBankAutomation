package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class LoginPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	By userName = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@id='password']");
	By submitBtn = By.xpath("//button[@id='submit']");

	public HomePage loginAUser(String userName, String password) {
		elementUtil.doSendKeys(this.userName, userName);
		elementUtil.doSendKeys(this.password, password);
		elementUtil.doClick(submitBtn);
		return new HomePage(driver);
	}

}
