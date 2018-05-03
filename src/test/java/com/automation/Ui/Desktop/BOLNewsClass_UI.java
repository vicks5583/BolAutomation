package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BOLNewsClass_UI extends BaseUi {
	WebDriver driver;

	public BOLNewsClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[class = 'x-close']")
	private WebElement btnCloseTutorial;
	
	@FindBy(css = "[class = 'logo']")
	private WebElement bolNewsLogo;
	
	@FindBy(css = "[class = 'searchBox']")
	private WebElement bolNewsSearchField;
	
	
	
	public void WaitAndCloseTutorial() {
		hardwait(20);
		btnCloseTutorial.click();
	}
	
	public void CheckBolNewsLogo() {
		// Assert.assertEquals("Google", driver.getTitle()); 
		// OR
		isElementDisplayed(bolNewsLogo);
	}
	
	public void CheckBolNewsSearchField() {
		isElementDisplayed(bolNewsSearchField);
	}
	
	
	/*
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
