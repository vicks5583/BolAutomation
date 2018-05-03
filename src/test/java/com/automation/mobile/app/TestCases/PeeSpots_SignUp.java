package com.automation.mobile.app.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.DSLLib.DSLLibMobile;

public class PeeSpots_SignUp {
	
	DSLLibMobile dslm;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
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
	public void Test04_Check_SignUp_Button() {
		dslm.peespotSignUp.CheckSignUpButton();
	}
	
	@Test
	public void Test05_Click_SignUp_Button() {
		dslm.peespotSignUp.ClickSignUpButton();
	}
	
	// Sign Up Form
	@Test
	public void Test06_Verify_SignUp_Title() {
		dslm.peespotSignUp.CheckSignUpTitle();
	}
	
	@Test
	public void Test07_Verify_Full_Name_Label() {
		dslm.peespotSignUp.CheckFullNameLabel();
	}
	
	@Test
	public void Test08_Verify_Full_Name_Text_Field() {
		dslm.peespotSignUp.CheckFullNameTextField();
	}
	
	@Test
	public void Test09_Enter_FullName() {
		dslm.peespotSignUp.EnterFullName();
	}
	
	@Test
	public void Test10_Verify_Email_Label() {
		dslm.peespotSignUp.CheckEmailLabel();
	}
	
	@Test
	public void Test11_Verify_Email_Text_Field() {
		dslm.peespotSignUp.CheckEmailTextField();
	}
	
	@Test
	public void Test12_Enter_Email() {
		dslm.peespotSignUp.EnterEmail();
	}
	
	@Test
	public void Test13_Verify_Country_Code_Label() {
		dslm.peespotSignUp.CheckCountryCodeLabel();
	}
	
	@Test
	public void Test14_Verify_Country_Code_Text_Field() {
		dslm.peespotSignUp.CheckCountryCodeTextField();
	}
	
	@Test
	public void Test15_Click_Country_Code() {
		dslm.peespotSignUp.ClickCountryCode();
	}
	
	@Test
	public void Test16_Check_Country_Code_Search_Field() {
		dslm.peespotSignUp.CheckCountryCodeSearchField();
	}
	
	@Test
	public void Test17_Enter_Country_Code() {
		dslm.peespotSignUp.EnterCountryCode();
	}
	
	@Test
	public void Test18_Select_Country_Code() {
		dslm.peespotSignUp.SelectCountryCode();
	}
	
	@Test
	public void Test19_Verify_Phone_Text_Field() {
		dslm.peespotSignUp.CheckPhoneTextField();
	}
	
	@Test
	public void Test20_Enter_Phone_Field() {
		dslm.peespotSignUp.EnterPhoneField();
	}
	
	@Test
	public void Test21_Swipe() throws InterruptedException {
		dslm.peespotSignUp.SwipingVerticalBottomToTop();
	}
	
	@Test
	public void Test22_Verify_Password_Label() {
		dslm.peespotSignUp.CheckPasswordLabel();
	}
	
	@Test
	public void Test23_Verify_Password_Text_Field() {
		dslm.peespotSignUp.CheckPasswordTextField();
	}
	
	@Test
	public void Test24_EnterPassword() throws InterruptedException {
		dslm.peespotSignUp.EnterPassword();
		dslm.peespotSignUp.SwipingVerticalBottomToTop();
	}
	
	@Test
	public void Test25_Verify_Terms_And_Condition_Text() {
		dslm.peespotSignUp.CheckTermsAndConditionText();
	}
	
	@Test
	public void Test26_Verify_Sign_Up_Button2() {
		dslm.peespotSignUp.CheckSignUpButton2();
	}
	
	// Navigation Menu
	/*
	@Test
	public void Test27_Check_Navigation_Menu() {
		dslm.peespotSignUp.CheckNavigationMenu();
	}
	
	@Test
	public void Test28_CLick_On_NavigationMenu() {
		dslm.peespotSignUp.ClickNavigationMenu();
	}
	*/
	
	@AfterClass
	public void afterClass() {
		//close the app
		dslm.closeApp();
	}
}
