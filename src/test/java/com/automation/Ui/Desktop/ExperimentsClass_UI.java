package com.automation.Ui.Desktop;

import junit.framework.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;
import com.automation.util.StringMatcher;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class ExperimentsClass_UI extends BaseUi {
	WebDriver driver;

	String mobNumber = "";
	
	public ExperimentsClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//html/head/title")
	private WebElement bolwalaTitle;
	
	

	public void CheckBolwalaTitle() {
		Assert.assertEquals("Largest Platform of Best Discounts in Pakistan - Bolwala.com", driver.getTitle());
	}
	
	public void getLinks() {
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links)
			System.out.println(link.getAttribute("href"));
	}
	
}
