package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class NewSavingAccountPage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	public NewSavingAccountPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	 By saving = By.xpath("//input[@id='Savings']");
	 By individual = By.xpath("//input[@id='Individual']");
	 By accountName = By.xpath("//input[@id='name']");
	 By initialAmount = By.xpath("//input[@name='openingBalance']");
	 By submitBtn= By.xpath("//button[@id='newSavingsSubmit']");
	 
	 public void openNewSavingAccount() {
			elementUtil.doClick(saving);
			elementUtil.doClick(individual);
			elementUtil.doSendKeys(accountName, "Dua Karan, SA");
			elementUtil.doSendKeys(initialAmount, "1000.00");
			elementUtil.doClick(submitBtn);
		}
	

}
