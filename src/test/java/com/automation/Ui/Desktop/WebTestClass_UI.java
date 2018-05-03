package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class WebTestClass_UI extends BaseUi {
	WebDriver driver;

	public WebTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'hplogo']")
	private WebElement googleTitle;
	
	@FindBy(css = "[value = 'Google Search']")
	private WebElement googleSearchButton;
	
	@FindBy(css = "[value = 'I'm Feeling Lucky']")
	private WebElement googleFeelingLuckyButton;
	
	@FindBy(css = "[id = 'lst-ib']")
	private WebElement googleField;
	
	@FindBy(css = "[id = '_fZl']")
	private WebElement lookupButton;
	
	@FindBy(css = "[class = 'r']")
	private WebElement searchResult;
	
	public void CheckGoogleTitle() {
		Assert.assertEquals("Google", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
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
	}
}
