package com.automation.Ui.Mobile;

import static org.testng.Assert.assertTrue;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.BaseClass.BaseUiMobile;

public class PeeSpots_Login_UI extends BaseUiMobile{
	
	AndroidDriver driver;
	public PeeSpots_Login_UI(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id = "com.peespots:id/login_txtView_title")
	private WebElement loginTitle;
	
	@FindBy(id = "com.peespots:id/login_inputLayout_email")
	private WebElement emaillabel;
	
	@FindBy(id = "com.peespots:id/login_editText_email")
	private WebElement emailTextField;
	
	@FindBy(id = "com.peespots:id/login_inputLayout_password")
	private WebElement passwordLabel;
	
	@FindBy(id = "com.peespots:id/login_editText_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "com.peespots:id/login_txtView_forgot")
	private WebElement forgotLabel;
	
	@FindBy(id = "com.peespots:id/login_txtView_signIn")
	private WebElement signInButton;
	
	@FindBy(id = "com.peespots:id/login_txtView_fb")
	private WebElement signInButtonFb;
	
	@FindBy(id = "com.peespots:id/login_txtView_dontHaveAccount")
	private WebElement dontHaveAccount;
	
	public void CheckLoginTitle() {
		String txt = loginTitle.getText();
		assertTrue(txt.contains("Sign in to access your account"), "String did not contain Login Title");
	}
	
	public void CheckEmailLabel() {
		String txt = emaillabel.getText();
		assertTrue(txt.contains("Email"), "String did not contain Email Label");
	}
	
	public void CheckEmailTextField() {
		isElementDisplayed(emailTextField);
	}
	
	public void EnterEmail() {
		emailTextField.sendKeys("naima.khan@cubixlabs.com");
		hardwait(2);
	}
	
	public void CheckPasswordLabel() {
		String txt = passwordLabel.getText();
		assertTrue(txt.contains("Password"), "String did not contain Password Label");
	}
	
	public void CheckPasswordTextField() {
		isElementDisplayed(passwordTextField);
	}
	
	public void EnterPassword() {
		passwordTextField.sendKeys("1234566");
		hardwait(2);
	}
	
	public void CheckForgotLabel() {
		String txt = forgotLabel.getText();
		assertTrue(txt.contains("Forgot?"), "String did not contain Forgot? Label");
	}
	
	public void CheckSignInButton() {
		String txt = signInButton.getText();
		assertTrue(txt.contains("Sign In"), "String did not contain Sign In Label");
	}
	
	public void CheckSignInWithFbButton() {
		String txt = signInButtonFb.getText();
		assertTrue(txt.contains("Sign in with Facebook"), "String did not contain Sign in with Facebook Label");
	}
	
	public void CheckDontHaveAccount() {
		String txt = dontHaveAccount.getText();
		assertTrue(txt.contains("Don’t have an account?"), "String did not contain Don’t have an account? Label");
	}
}
