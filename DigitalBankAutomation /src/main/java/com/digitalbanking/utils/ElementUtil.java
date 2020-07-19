package com.digitalbanking.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.digitalbanking.base.BasePage;

public class ElementUtil extends BasePage {
	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getElement(By locator) {
		WebElement element = null;
		element = driver.findElement(locator);
		return element;
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public void waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = getElement(locator);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public String getPageTitle() {
		return driver.getTitle();
	}


}
