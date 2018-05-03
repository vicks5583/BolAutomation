package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BOLNetworkClass_UI extends BaseUi {
	WebDriver driver;

	public BOLNetworkClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[class = 'logo']")
	private WebElement logoBolNetwork;
	
	/*@FindBy(css = "[value = 'Google Search']")
	private WebElement googleSearchButton;
	
	@FindBy(css = "[value = 'I'm Feeling Lucky']")
	private WebElement googleFeelingLuckyButton;
	
	@FindBy(css = "[id = 'lst-ib']")
	private WebElement googleField;
	
	@FindBy(css = "[id = '_fZl']")
	private WebElement lookupButton;
	
	@FindBy(css = "[class = 'r']")
	private WebElement searchResult;*/
	
	public void CheckBolNetworkLogo() {
		//Assert.assertEquals("Google", driver.getTitle()); 
		// OR
		isElementDisplayed(logoBolNetwork);
	}
	/*
	public void CheckGoogleSearchButton() {
		isElementDisplayed(googleSearchButton);
	}
	
	public void CheckGoogleFeelingLuckyButton() {
		isElementDisplayed(googleSearchButton);
	}
	
	public void CheckGoogleField() {
		isElementDisplayed(googleField);
	}
	
	public void EnterGoogleField() {
		googleField.sendKeys("how to do automation testing using selenium webdriver");
		hardwait(2);
	}
	
	public void ClickLookup() {
		lookupButton.click();
		hardwait(2);
	}
	
	public void CheckSearchResult() {
		isElementDisplayed(searchResult);
	}*/
}
