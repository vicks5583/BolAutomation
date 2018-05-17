package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BolwalaClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	dsl.launchBolwala();
		  	//dsl.launchGoogle();
	  }
	  
	  @Test
	  public void Test01_Verify_Bolwala_Title(){
		  dsl.bolwalaclass.CheckBolwalaTitle();
	  }
	  
	  @Test
	  public void Test02_Verify_Bolwala_Logo() {
			  dsl.bolwalaclass.CheckBolwalaLogo();
	  }
	  
	  @Test
	  public void Test03_Verify_Bolwala_Categories() {
			  dsl.bolwalaclass.CheckCategories();
	  }
	  
	  @Test
	  public void Test04_Verify_Bolwala_For_Sellers_Link() {
			  dsl.bolwalaclass.CheckLinkForSellers();
	  }
	  
	  @Test
	  public void Test05_Verify_Location_Dropdown() {
			  dsl.bolwalaclass.CheckLocationDropdown();
	  }
	  
	  @Test
	  public void Test06_Verify_Help_Dropdown() {
			  dsl.bolwalaclass.CheckHelpDropdown();
	  }
	  
	  @Test
	  public void Test07_Verify_Phone_Number() {
			  dsl.bolwalaclass.CheckPhoneNumber();
	  }
	  
	  @Test
	  public void Test08_Verify_Email_Address() {
			  dsl.bolwalaclass.CheckEmailAddress();
	  }
	  
	  @Test
	  public void Test09_Verify_Bolwala_Login_Link() {
			  dsl.bolwalaclass.CheckLinkForLogin();
	  }
	  
	  @Test
	  public void Test10_Verify_Bolwala_Signup_Link() {
			  dsl.bolwalaclass.CheckLinkForSignup();
	  }
	  
	  @Test
	  public void Test11_Verify_Bolwala_Search_Field() {
			  dsl.bolwalaclass.CheckSearchField();
	  }
	  
	  @Test
	  public void Test12_Verify_Top_Banner() {
			  dsl.bolwalaclass.CheckTopBanner();
	  }
	  
	  @Test
	  public void Test13_Verify_Bolwala_Product_Tabs() {
			  dsl.bolwalaclass.CheckProductTabs();
	  }
	  
	  @Test
	  public void Test14_Verify_First_Product_Presence() {
			  dsl.bolwalaclass.CheckFirstProduct();
	  }
	  
	  @Test
	  public void Test15_Search_Verify_Redirect() {
			  dsl.bolwalaclass.Search_Case1();
	  }
	  
	  @Test
	  public void Test16_Click_CreateAnAccount_To_Redirect(){
		  dsl.bolwalaclass.ClickLinkForSignup();
	  }
	  
	  @Test
	  public void Test17_Fill_The_Form(){
		  dsl.bolwalaclass.FillTheForm();
	  }
	  
	  @Test
	  public void Test18_Submit_The_Form(){
		  dsl.bolwalaclass.ClickSignup();
	  }
	  
	  @Test
	  public void Test19_Redirect_To_My_Account(){
		  dsl.bolwalaclass.ClickUserName();
		  dsl.bolwalaclass.ClickMyAccount();
	  }
	  
	  @Test
	  public void Test20_Verify_User_Pin_Code(){
		  dsl.bolwalaclass.GetPinNumberAndVerify();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
