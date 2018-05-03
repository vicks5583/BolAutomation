package com.automation.Ui.Desktop;

import junit.framework.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;
import com.automation.util.StringMatcher;

public class BolwalaCompleteFlowClass_UI extends BaseUi {
	WebDriver driver;

	String mobNumber = "";
	
	public BolwalaCompleteFlowClass_UI(WebDriver driver) {
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
	
	/*@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[6]/div/div/span")
	private WebElement chkTermsAndPrivacy;*/
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-customer-signup/div/div/div/div/div[1]/div/div[2]/div[7]/a/span")
	private WebElement btnSignup;
	
	@FindBy(css = "[class = 'userName']")
	private WebElement linkUserName;
	
	@FindBy(linkText = "My Account")
	private WebElement linkMyAccount;
	
	@FindBy(css = "[class = 'signout']")
	private WebElement linkSignout;
	
	@FindBy(css = "[class = 'idTag']")
	private WebElement pinNumber;
	
	public void CheckBolwalaTitle() {
		Assert.assertEquals("Largest Platform of Best Discounts in Pakistan - Bolwala.com", driver.getTitle());
	}
	
	public void ClickLinkForSignup(){
		isElementDisplayed(linkForSignup);
		linkForSignup.click();
		hardwait(5);
	}
	
	public void FillTheForm(){
		isElementDisplayed(txtFullName);
		txtFullName.sendKeys("BolAuto");
		txtMobileNumber.sendKeys("03009"+formatedDate());
		mobNumber = "PIN: 923009"+formatedDate();
		System.out.println(mobNumber);
		//txtEmail.sendKeys("vickstester@yahoo.com");
		txtPassword.sendKeys("123456");
		txtConfirmPassword.sendKeys("123456");
		clickUsingJS(chkTermsAndPrivacy);
		hardwait(5);
	}
	
	public void ClickSignup(){
		btnSignup.click();
		hardwait(15);
	}
	
	public void ClickUserName(){
		linkUserName.click();
		hardwait(1);
	}
	
	public void ClickMyAccount(){
		linkMyAccount.click();
		hardwait(5);
	}
	
	public void GetPinNumberAndVerify(){
		String customerPinNumber = pinNumber.getText();
		assertEquals(customerPinNumber, mobNumber);
		System.out.println("Customer Pin Number is"+customerPinNumber);
		System.out.println("Provided Mobile number is"+mobNumber);
	}
}
