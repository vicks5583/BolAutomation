package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BolwalaMerchantClass_UI extends BaseUi {
	WebDriver driver;

	public BolwalaMerchantClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//html/head/title")
	private WebElement bolwalaTitle;
	
	
	public void CheckBolwalaTitle() {
		Assert.assertEquals("Largest Platform of Best Discounts in Pakistan - Bolwala.com", driver.getTitle()); 
		// OR
		//isElementDisplayed(bolwalaLogo);
	}
	
	
}
