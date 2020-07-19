package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class TransferMoneyPage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	public TransferMoneyPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	By fromAccount = By.xpath("//select[@name='fromAccount']");
	By toAccount= By.xpath("//select[@id='toAccount']");
	By transferAmount=By.xpath("//input[@id='amount']");
	By submitButton=By.xpath("//button[contains(.,'Submit')]");
	
	public void transferMoney() {
		elementUtil.doSendKeys(fromAccount, "Dua Karan, CA");
		elementUtil.doSendKeys(toAccount, "Dua Karan, SA");
		elementUtil.doSendKeys(transferAmount, "100.00");
		elementUtil.doClick(submitButton);
	}

}
