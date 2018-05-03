package com.automation.Ui.Desktop;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUi;

public class BolwalaClass_UI extends BaseUi {
	WebDriver driver;

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
	
	@FindBy(xpath = "//html/body/app-root/app-public/div/app-deals/div/div/div/div[2]/div[2]/ul/li[1]")
	private WebElement firstProduct;
	
	@FindBy(linkText = "A.D Rentals")
	private WebElement suggestionForRentals;
	
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
		isElementDisplayed(categoryMiscellaneous);
	}
	
	public void CheckLinkForSellers(){
		isElementDisplayed(linkForSellers);
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
}
