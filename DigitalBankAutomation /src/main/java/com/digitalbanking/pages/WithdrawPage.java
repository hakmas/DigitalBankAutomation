package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class WithdrawPage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	public WithdrawPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	By accountForWithdraw = By.xpath("//select[@name='id']");
	By amountForWithdraw = By.xpath("//input[@name='amount']");
	By submitBtn = By.xpath("//button[contains(.,'Submit')]");
	
	public void witdrawMoney() {
		elementUtil.doSendKeys(accountForWithdraw, "Dua Karan, CA");
		elementUtil.doSendKeys(amountForWithdraw, "50.00");
		elementUtil.doClick(submitBtn);
	}
}
