package com.automation.Ui.Desktop;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BolwalaClass_UI extends BaseUi {
	WebDriver driver;
	
	String mobNumber = "";

	public BolwalaClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//html/head/title")
	private WebElement bolwalaTitle;
	
	@FindBy(css = "[class = 'logo']")
	private WebElement bolwalaLogo;
	
	//Categories
	@FindBy(linkText = "Food & Drinks")
	private WebElement categoryFoodAndDrinks;
	
	@FindBy(linkText = "Beauty & Salon")
	private WebElement categoryBeautyAndSalon;
	
	@FindBy(linkText = "Fashion")
	private WebElement categoryFashion;
	
	@FindBy(linkText = "Grocery & Household")
	private WebElement categoryGroceryAndHousehold;
	
	@FindBy(linkText = "Electronics & Computers")
	private WebElement categoryElectronicsAndComputers;
	
	@FindBy(linkText = "Kids")
	private WebElement categoryKids;
	
	@FindBy(linkText = "Mobile & Internet")
	private WebElement categoryMobileAndInternet;
	
	@FindBy(linkText = "Home & Living")
	private WebElement categoryHomeAndLiving;
	
	@FindBy(linkText = "Health & Fitness")
	private WebElement categoryHealthAndFitness;
	
	@FindBy(linkText = "Arts & Entertainment")
	private WebElement categoryArtsAndEntertainment;
	
	@FindBy(linkText = "Travel & Lodging")
	private WebElement categoryTravelAndLodging;
	
	@FindBy(linkText = "Events")
	private WebElement categoryEvents;
	
	@FindBy(linkText = "Education")
	private WebElement categoryEducation;
	
	@FindBy(linkText = "Transport & Automotive")
	private WebElement categoryTransportAndAutomotive;
	
	@FindBy(linkText = "Services")
	private WebElement categoryServices;
	
	@FindBy(linkText = "Miscellaneous")
	private WebElement categoryMiscellaneous;
	
	@FindBy(linkText = "For Sellers")
	private WebElement linkForSellers;
	
	@FindBy(css = "[class = 'x-location']")
	private WebElement dropDownLocation;
	
	@FindBy(xpath = "//html/body/app-root/app-public/app-header/header/div[2]/div[1]/ul/li[3]/div/div[1]/span")
	private WebElement dropDownHelp;
	
	@FindBy(css = "[class = 'x-phone']")
	private WebElement phoneNumber;
	
	@FindBy(css = "[class = 'x-message']")
	private WebElement emailAddress;
	
	@FindBy(css = "[class = 'login']")
	private WebElement linkForLogin;
	
	@FindBy(xpath = "//html/body/app-root/app-public/app-header/header/div[2]/div[2]/div[3]/ul/li[2]/ul/li[2]/a")
	private WebElement linkForSignup;
	
	@FindBy(xpath = "//html/body/app-root/app-public/app-header/header/div[2]/div[2]/div[3]/ul/li[1]/div/div[2]/div/input")
	private WebElement searchField;
	
	@FindBy(css = "[class = 'topBanner']")
	private WebElement bannerTop;
	
	@FindBy(linkText = "Popular")
	private WebElement tabPopular;
	
	@FindBy(linkText = "Featured")
	private WebElement tabFeatured;
	
	@FindBy(linkText = "Highest")
	private WebElement tabHighest;
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-deals/div/div/div[1]/div[2]/app-discount-card-list/div/ul/li[1]")
	private WebElement firstProduct;
	
	@FindBy(linkText = "A.D Rentals")
	private WebElement suggestionForRentals;
	
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
	
	public void CheckBolwalaLogo(){
		isElementDisplayed(bolwalaLogo);
	}
	
	public void CheckCategories(){
		isElementDisplayed(categoryFoodAndDrinks);
		isElementDisplayed(categoryBeautyAndSalon);
		isElementDisplayed(categoryFashion);
		isElementDisplayed(categoryGroceryAndHousehold);
		isElementDisplayed(categoryElectronicsAndComputers);
		isElementDisplayed(categoryKids);
		isElementDisplayed(categoryMobileAndInternet);
		isElementDisplayed(categoryHomeAndLiving);
		isElementDisplayed(categoryHealthAndFitness);
		isElementDisplayed(categoryArtsAndEntertainment);
		isElementDisplayed(categoryTravelAndLodging);
		isElementDisplayed(categoryEvents);
		isElementDisplayed(categoryEducation);
		isElementDisplayed(categoryTransportAndAutomotive);
		isElementDisplayed(categoryServices);
	}
	
	public void CheckLinkForSellers(){
		isElementDisplayed(linkForSellers);
	}
	
	public void CheckLocationDropdown(){
		isElementDisplayed(dropDownLocation);
	}
	
	public void CheckHelpDropdown(){
		isElementDisplayed(dropDownHelp);
	}
	
	public void CheckPhoneNumber(){
		isElementDisplayed(phoneNumber);
	}
	
	public void CheckEmailAddress(){
		isElementDisplayed(emailAddress);
	}
	
	public void CheckLinkForLogin(){
		isElementDisplayed(linkForLogin);
	}
	
	public void CheckLinkForSignup(){
		isElementDisplayed(linkForSignup);
	}
	
	public void CheckSearchField(){
		isElementDisplayed(searchField);
	}
	
	public void CheckTopBanner(){
		isElementDisplayed(bannerTop);
	}
	
	public void CheckProductTabs(){
		isElementDisplayed(tabPopular);
		isElementDisplayed(tabFeatured);
		isElementDisplayed(tabHighest);
	}
	
	public void CheckFirstProduct(){
		isElementDisplayed(firstProduct);
	}
	
	public void Search_Case1(){
		searchField.sendKeys("ren");
		hardwait(3);
		isElementDisplayed(suggestionForRentals);
		suggestionForRentals.click();
		hardwait(10);
		getCurrentUrl().compareTo("https://bolwala.com/AD-Rentals-319");
		bolwalaLogo.click();
		hardwait(10);
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
