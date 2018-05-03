package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BolwalaSignupClass_UI extends BaseUi {
	WebDriver driver;

	public BolwalaSignupClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//html/head/title")
	private WebElement bolwalaTitle;
	
	@FindBy(xpath = "//html/body/app-root/app-public/app-header/header/div[2]/div[2]/div[3]/ul/li[2]/ul/li[2]/a")
	private WebElement linkForSignup;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[1]/input")
	private WebElement txtFullName;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[2]/input")
	private WebElement txtMobileNumber;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[3]/input")
	private WebElement txtEmail;
	
	@FindBy(xpath = "/html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[4]/input")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[5]/input")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[6]/div/div/input")
	private WebElement chkTermsAndPrivacy;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[7]/a/span")
	private WebElement btnSignup;
	
	@FindBy(css = "[class = 'thankDetailSeperate']")
	private WebElement verificationText;
	
	public void CheckBolwalaTitle() {
		Assert.assertEquals("Largest Platform of Best Discounts in Pakistan - Bolwala.com", driver.getTitle());
	}
	
	public void ClickLinkForSignup(){
		isElementDisplayed(linkForSignup);
		linkForSignup.click();
		hardwait(10);
	}
	
	public void FillTheForm(){
		isElementDisplayed(txtFullName);
		txtFullName.sendKeys("BolAuto");
		txtMobileNumber.sendKeys("03004"+formatedDate());
		//txtEmail.sendKeys("vickstester@yahoo.com");
		txtPassword.sendKeys("123456");
		txtConfirmPassword.sendKeys("123456");
		chkTermsAndPrivacy.click();
	}
	
	public void ClickSignup(){
		btnSignup.click();
		hardwait(10);
	}
	
	/*public void VerifySignup(){
		isElementDisplayed(verificationText);
	}*/
}
