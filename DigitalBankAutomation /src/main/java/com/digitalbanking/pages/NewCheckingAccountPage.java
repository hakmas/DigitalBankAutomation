package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class NewCheckingAccountPage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	public NewCheckingAccountPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	By standardChecking = By.xpath("//input[@id='Standard Checking']");
	By individual = By.xpath("//input[@id='Individual']");
	By accountName = By.xpath("//input[@id='name']");
	By initialAmount = By.xpath("//input[@id='openingBalance']");
	By submitBtn = By.xpath("//button[contains(.,'Submit')]");
			
	public void openNewCheckingAccount() {
		elementUtil.doClick(standardChecking);
		elementUtil.doClick(individual);
		elementUtil.doSendKeys(accountName, "Dua Karan, CA");
		elementUtil.doSendKeys(initialAmount, "2000.00");
		elementUtil.doClick(submitBtn);
	}
	

}
