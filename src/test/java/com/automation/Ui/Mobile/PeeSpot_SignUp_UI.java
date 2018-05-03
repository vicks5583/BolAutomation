package com.automation.Ui.Mobile;

import static org.testng.Assert.assertTrue;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.BaseClass.BaseUiMobile;

public class PeeSpot_SignUp_UI extends BaseUiMobile {
	
	AndroidDriver driver;
	public PeeSpot_SignUp_UI(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id = "com.peespots:id/splash_imgView")
	private WebElement peeSpotFrontView;
	
	@FindBy(id = "com.peespots:id/tutorial_txtView_gotIt")
	private WebElement skipButton;
	
	@FindBy(id = "com.peespots:id/login_txtView_signUp")
	private WebElement signUp;
	
	@FindBy(id = "com.peespots:id/signup_txtView_title")
	private WebElement signUpTitle;
	
	@FindBy(id = "com.peespots:id/signup_inputLayout_name")
	private WebElement fullNameLabel;
	
	@FindBy(id = "com.peespots:id/signup_editText_name")
	private WebElement fullNameTextField;
	
	@FindBy(id = "com.peespots:id/signup_inputLayout_email")
	private WebElement emailLabel;
	
	@FindBy(id = "com.peespots:id/signup_editText_email")
	private WebElement emailTextField;
	
	@FindBy(id = "com.peespots:id/signup_inputLayout_countryCode")
	private WebElement countryCodeLabel;
	
	@FindBy(id = "com.peespots:id/signup_editText_countryCode")
	private WebElement countryCodeTextField;
	
	@FindBy(id = "com.peespots:id/signup_editText_phone")
	private WebElement phoneTextField;
	
	@FindBy(id = "com.peespots:id/signup_inputLayout_password")
	private WebElement passwordLabel;
	
	@FindBy(id = "com.peespots:id/signup_editText_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "com.peespots:id/signup_txtView_privacyPolicy")
	private WebElement termsAndConditionText;
	
	@FindBy(id = "com.peespots:id/signup_txtView_signup")
	private WebElement signUpButton2;
	
	@FindBy(id = "com.peespots:id/dialog_countryCode_editText_search")
	private WebElement countryCodeSearchField;
	
	@FindBy(id = "com.peespots:id/dialog_countryCode_textView_countryName")
	private WebElement countryCode;
	
	@FindBy(id = "com.peespots:id/actionbar_menu_btn")
	private WebElement navigationMenu;
	
	public void CheckPeeSpotFrontView() {
		isElementDisplayed(peeSpotFrontView);
		hardwait(5);
	}
	
	public void CheckSkipButton() {
		String txt = skipButton.getText();
		assertTrue(txt.contains("Skip"), "String did not contain Skip text");
	}
	
	public void ClickSkipButton() {
		skipButton.click();
		hardwait(3);
	}
	
	public void CheckSignUpButton() {
		String txt = signUp.getText();
		assertTrue(txt.contains("Sign Up"), "String did not contain Sign Up text");
	}
	
	public void ClickSignUpButton() {
		signUp.click();
		hardwait(2);
	}

	public void CheckSignUpTitle() {
		String txt = signUpTitle.getText();
		assertTrue(txt.contains("Provide your information for sign up"), "String did not contain Provide your information for sign up text");
	}
	
	public void CheckFullNameLabel() {
		String txt = fullNameLabel.getText();
		assertTrue(txt.contains("Full Name"), "String did not contain Full Name Label");
	}
	
	public void CheckFullNameTextField() {
		isElementDisplayed(fullNameTextField);
	}
	
	public void EnterFullName() {
		fullNameTextField.sendKeys("Naima Khan");
		hardwait(2);
	}
	
	public void CheckEmailLabel() {
		String txt = emailLabel.getText();
		assertTrue(txt.contains("Email"), "String did not contain Email Label");
	}
	
	public void CheckEmailTextField() {
		isElementDisplayed(emailTextField);
	}
	
	public void EnterEmail() {
		emailTextField.sendKeys("naima.khan".concat(timeStamp()).concat("@cubixlabs.com"));
		hardwait(2);
	}
	
	public void CheckCountryCodeLabel() {
		String txt = countryCodeLabel.getText();
		assertTrue(txt.contains("Country Code"), "String did not contain Country Code Label");
	}
	
	public void CheckCountryCodeTextField() {
		String txt = countryCodeTextField.getText();
		assertTrue(txt.contains("+1"), "String did not contain Country Code +1 by default");
	}
	
	public void ClickCountryCode() {
		countryCodeTextField.click();
		hardwait(2);
	}
	
	public void CheckCountryCodeSearchField() {
		isElementDisplayed(countryCodeSearchField);
	}
	
	public void EnterCountryCode() {
		countryCodeSearchField.sendKeys("Pakistan");
		hardwait(2);
	}
	
	public void SelectCountryCode() {
		countryCode.click();
		hardwait(2);
	}
	
	public void CheckPhoneTextField() {
		isElementDisplayed(phoneTextField);
	}
	
	public void EnterPhoneField() {
		phoneTextField.sendKeys("3412222222");
		hardwait(2);
	}
	
	public void SwipingVerticalBottomToTop() throws InterruptedException {
		SwipedVerticalBottomToTop();
	}
	
	public void CheckPasswordLabel() {
		String txt = passwordLabel.getText();
		assertTrue(txt.contains("Password"), "String did not contain Password Label");
	}
	
	public void CheckPasswordTextField() {
		isElementDisplayed(passwordTextField);
	}
	
	public void EnterPassword() {
		passwordTextField.sendKeys("abcdefgh");
		hardwait(2);
	}
	
	public void CheckTermsAndConditionText() {
		String txt = termsAndConditionText.getText();
		assertTrue(txt.contains("By signing up, you agree our Terms & Conditions and Privacy Policy"), "String did not contain terms and conditions text");
	}
	
	public void CheckSignUpButton2() {
		String txt = signUpButton2.getText();
		assertTrue(txt.contains("Sign Up"), "String did not contain Sign Up Text");
	}
	
	public void CheckNavigationMenu() {
		isElementDisplayed(navigationMenu);
	}
	
	public void ClickNavigationMenu() {
		navigationMenu.click();
		hardwait(2);
	}
	
	
}
