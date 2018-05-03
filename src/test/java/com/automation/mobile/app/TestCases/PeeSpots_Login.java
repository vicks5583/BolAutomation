package com.automation.mobile.app.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibMobile;

public class PeeSpots_Login {
  
	DSLLibMobile dslm;
    
	@BeforeClass
    public void beforeClass() throws MalformedURLException{
		dslm = new DSLLibMobile();
    }

	@Test
	public void Test01_VerifyFrontView(){
		dslm.peespotSignUp.CheckPeeSpotFrontView();
	}
	
	@Test
	public void Test02_VerifySkipButton() {
		dslm.peespotSignUp.CheckSkipButton();
	}
	
	@Test
	public void Test03_Click_Skip_Button() {
		dslm.peespotSignUp.ClickSkipButton();
	}
	
	@Test
	public void Test04_Verify_Login_Title() {
		dslm.peespotLogin.CheckLoginTitle();
	}
	
	@Test
	public void Test05_Verify_Email_Label() {
		dslm.peespotLogin.CheckEmailLabel();
	}
	
	@Test
	public void Test06_Verify_Email_TextField() {
		dslm.peespotLogin.CheckEmailTextField();
	}
	
	@Test
	public void Test07_Enter_Email() {
		dslm.peespotLogin.EnterEmail();
	}
	
	@Test
	public void Test08_Verify_Password_Label() {
		dslm.peespotLogin.CheckPasswordLabel();
	}
	
	@Test
	public void Test09_Verify_Password_TextField() {
		dslm.peespotLogin.CheckPasswordTextField();
	}
  
	@Test
	public void Test10_Enter_Password() {
		dslm.peespotLogin.EnterPassword();
	}
	
	@Test
	public void Test11_Verify_Forgot_Password_Label() {
		dslm.peespotLogin.CheckForgotLabel();
	}
	
	@Test
	public void Test12_Verify_Sign_In_Button() throws InterruptedException {
		dslm.peespotSignUp.SwipingVerticalBottomToTop();
		dslm.peespotLogin.CheckSignInButton();
	}
	
	@Test
	public void Test13_Verify_Sign_In_With_Facebook() {
		dslm.peespotLogin.CheckSignInWithFbButton();
	}
	
	@Test
	public void Test14_Verify_DontHaveAccount() {
		dslm.peespotLogin.CheckDontHaveAccount();
	}
	
	@Test
	public void Test15_Check_SignUp_Button() {
		dslm.peespotSignUp.CheckSignUpButton();
	}
	
    @AfterClass
    public void afterClass() {
    	//close the app
    	dslm.closeApp();
    }

}
