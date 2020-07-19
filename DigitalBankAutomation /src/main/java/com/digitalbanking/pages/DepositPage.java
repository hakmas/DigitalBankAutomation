package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class DepositPage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	public DepositPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	By selectAccount =  By.xpath("//select[@id='id']");
	By depositAmount = By.xpath("//input[@name='amount']");
	By submitBtn = By.xpath("//button[contains(.,'Submit')]");
	
	public void doDeposit() {
		elementUtil.doSendKeys(selectAccount, "Dua Karan, CA");
		elementUtil.doSendKeys(depositAmount, "3000.00");
		elementUtil.doClick(submitBtn);
	}
	

}
