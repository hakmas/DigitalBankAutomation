package com.digitalbanking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.digitalbanking.base.BasePage;
import com.digitalbanking.utils.ElementUtil;

public class HomePage extends BasePage{
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	//capture elements:
	
	By homeLink= By.xpath("//a[@href='/home']");
	By checkingMenu= By.xpath("(//a[contains(.,'Checking')])[1]");
	By viewCheckingLink= By.xpath("//a[contains(.,'View Checking')]");
	By newCheckingLink= By.xpath("//a[contains(.,'New Checking')]");
	By savingMenu= By.xpath("//a[@id='savings-menu']");
	By viewSavingLink= By.xpath("//a[contains(.,'View Savings')]");
	By newSavingLink= By.xpath("//a[contains(.,'New Savings')]");
	By transactionMenu= By.xpath("//a[contains(.,'Transactions')]");
	By depositLink= By.xpath("//a[contains(.,'Deposit')]");
	By withdrawLink= By.xpath("//a[contains(.,'Withdraw')]");
	By digitalCreditMenu= By.xpath("//a[contains(.,'Digital Credit')]");
	By newApplicationLink= By.xpath("//a[contains(.,'New Application')]");
	By transferMenu= By.xpath("//a[@href='#'][contains(.,'Transfer')]");
	By betweenAccountsLink= By.xpath("//a[contains(.,'Between Accounts')]");
	By visaDirectMenu= By.xpath("//a[contains(.,'VISA Direct')]");
	By visaTransferLink= By.xpath("//a[contains(.,'VISA Transfer')]");
//	By = By.xpath("");
	
	public boolean verifyHomePage() {
		return elementUtil.doIsDisplayed(homeLink);
	}
	public void goToViewCheckingAccount() {
		elementUtil.doClick(checkingMenu);
		elementUtil.doClick(viewCheckingLink);
	}
	public NewCheckingAccountPage goToNewCheckingAccount() {
		elementUtil.doClick(checkingMenu);
		elementUtil.doClick(newCheckingLink);
		return new NewCheckingAccountPage(driver);
	}
	public void goToViewSavingAccount() {
		elementUtil.doClick(savingMenu);
		elementUtil.doClick(viewSavingLink);
	}
	public NewSavingAccountPage goToNewSavingAccount() {
		elementUtil.doClick(savingMenu);
		elementUtil.doClick(newSavingLink);
		return new NewSavingAccountPage(driver);
	}
	public DepositPage goToDepositAccount() {
		elementUtil.doClick(transactionMenu);
		elementUtil.doClick(depositLink);
		return new DepositPage(driver);
	}
	public WithdrawPage goToWitdrawAccount() {
		elementUtil.doClick(transactionMenu);
		elementUtil.doClick(withdrawLink);
		return new WithdrawPage(driver);
	}
	public void goToNewApplicationAccount() {
		elementUtil.doClick(digitalCreditMenu);
		elementUtil.doClick(newApplicationLink);
	}
	public TransferMoneyPage goToTransferBetweenAccounts() {
		elementUtil.doClick(transferMenu);
		elementUtil.doClick(betweenAccountsLink);
		return new TransferMoneyPage(driver);
	}
	public void goToVisaTransferAccount() {
		elementUtil.doClick(visaDirectMenu);
		elementUtil.doClick(visaTransferLink);
	}
	
}
